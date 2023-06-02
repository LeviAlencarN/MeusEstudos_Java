package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            String employeeCsv = bf.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bf.readLine();
            }

            Collections.sort(list);
            for(Employee emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
