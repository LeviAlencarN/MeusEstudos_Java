import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            System.out.println("Números da diagonal: " + mat[i][i] + " ");
        }

        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Numeros negativos: " + count);

        sc.close();
    }
}
