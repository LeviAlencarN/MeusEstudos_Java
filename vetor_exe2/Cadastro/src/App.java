import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de pessoas: ");

        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        String nome;
        int idade;
        double altura;

        /* coletando dados */
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();

            System.out.println("Digite a idade: ");
            idade = sc.nextInt();

            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();

            vect[i] = new Pessoas(nome, idade, altura);
        }


        /* media de alturas */
        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getAltura();
        }

        double mediaALtura = sum / n;
        System.out.println("A média das alturas é igual a: " + mediaALtura);
        
        /* Porcentagem de idades */
        int count = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                count += 1;
            }
        }
        double porcentagem = count * 100 / n;
        System.out.println("Porcentagem de pessoas com idade menor que 16: " +  porcentagem);


        sc.close();
    }
}
