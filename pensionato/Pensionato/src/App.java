import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.println("Digite o número de quartos a serem alugados: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Pessoa nº" + i + ":");

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.next();

            System.out.println("Quarto: ");
            int Numeroquarto = sc.nextInt();

            vect[Numeroquarto] = new Aluguel(nome, email);
        }

        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
