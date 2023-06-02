import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }

        double media = sum / n;

        System.out.println("A media das alturas é: " + media);

        sc.close();
    }
}
