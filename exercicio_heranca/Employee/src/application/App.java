package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
 
        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced? (y/n) ");
            char outsourced = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Hours: ");
            int hours = sc.nextInt();

            System.out.println("Value per hour: ");
            double vph = sc.nextDouble();

            if(outsourced == 'y'){
                System.out.println("Additional charge: ");
                double addcharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, vph, addcharge);
                employee.add(emp);
            }

            else{
                Employee emp = new Employee(name, hours, vph);
                employee.add(emp);
            }

        }

        System.out.println();
        System.out.println("Payments");

        for(Employee emp : employee){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
