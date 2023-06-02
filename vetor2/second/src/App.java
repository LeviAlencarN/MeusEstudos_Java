import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        Products[] vect = new Products[n];

        for(int i = 0; i < n; i++){
            sc.nextInt();

            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Products(name, price);
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.println("Dados: " + avg);

        sc.close();
    }
}
