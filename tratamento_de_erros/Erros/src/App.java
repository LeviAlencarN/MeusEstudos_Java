import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();

            System.out.println(vect[position]);        
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição não encontrada!");
        }
        catch(InputMismatchException e){
            System.out.println("Use apenas números!");
        }

        System.out.println("Fim do programa!");


        sc.close();
    }
}
