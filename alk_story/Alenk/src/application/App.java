package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");

            System.out.print("Common, Used or Imported? (c / u / i)");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(type == 'u'){
                System.out.print("Manufacture date: ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            }

            else if(type == 'i'){
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
            else{
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for(Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
