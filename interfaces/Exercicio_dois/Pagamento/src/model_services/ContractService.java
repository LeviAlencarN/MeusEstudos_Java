package model_services;

import java.time.LocalDate;

import model_entities.Contract;
import model_entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void proccessContract(Contract contract, int month){

        double basicQuota = contract.getTotalValue() / month;
        for(int i = 1; i <= month; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallment().add(new Installment(dueDate, quota));
        }
    }
    

}
