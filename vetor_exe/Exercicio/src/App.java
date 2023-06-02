import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros você irá adicionar no vetor (max 10 | min 1)? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        

        if(n <= 10){
            System.out.println("Digite " + n + " números negativos ou positivos: ");
            for(int i = 0; i < vect.length; i++){
                vect[i] = sc.nextDouble();
            }

            System.out.println();
            for(int i = 0; i < vect.length; i++){ 
                if(vect[i] < 0){
                    System.out.println("Numero(s) negativos: " + vect[i]);
                }
            }
        }
        else{
            System.out.println("Você escolheu uma quantidade de números > 10 ou < 1");
        
        }



        

        sc.close();
    }
}
