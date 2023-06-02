package model_services;

import java.time.Duration;

import model_entities.CarRental;
import model_entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService tax) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.tax = tax;
    }

    private TaxService tax;

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public TaxService getTax() {
        return tax;
    }

    public void setTax(BrazilTaxService tax) {
        this.tax = tax;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hour = minutes / 60;

        double basicPayment;
        if(hour > 12){
            basicPayment = pricePerDay * Math.ceil(hour / 24);
        }
        else{
            basicPayment = pricePerHour * Math.ceil(hour);
        }

        double taxa = tax.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, taxa));
    }


}
