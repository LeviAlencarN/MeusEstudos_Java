import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Products;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Products> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File srcFile = new File(sourceFileStr);
        String srcFolder = srcFile.getParent();

        boolean success = new File(srcFolder + "\\out").mkdir();

        System.out.println("Folder created: " + success);

        String targetFile = srcFolder + "\\out\\sumary.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String itemCsv = br.readLine();
            while(itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Products(name, price, quantity));
                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for(Products product : list){
                    bw.write(product.getName() + "," +  String.format("%.2f", product.total()) );
                    bw.newLine();
                }
                System.out.println(targetFile + " created");

            }catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
