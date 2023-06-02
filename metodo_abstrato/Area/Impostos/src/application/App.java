package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");

            System.out.print("Individual or company (i / c): ");
            char ioc = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextInt();

            if(ioc == 'i'){
                System.out.print("Health expenditures: ");
                double gastosComSaude = sc.nextDouble();

                list.add(new PessoaFisica(name, rendaAnual, gastosComSaude));
            }

            else if(ioc == 'c'){
                System.out.println("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();

                list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
            }

            else{
                System.err.println("ERRO");
                sc.close();
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        for(Pessoa pss : list){
            System.out.println(pss.getName() + ": " + String.format("%.2f", pss.tax()));
        }

        System.out.println();
        System.out.print("TOTAL TAXES: ");

        double sum = 0.0;
        for(Pessoa pss : list){
            sum += pss.tax();
            System.out.printf(String.format("%.2f", sum));
        }


        sc.close();
    }
}
