import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = sc.nextDouble();

        Config calulator = new Config(base, altura);

        System.out.println("O valor da área é: " + calulator.calc());
    }
}
