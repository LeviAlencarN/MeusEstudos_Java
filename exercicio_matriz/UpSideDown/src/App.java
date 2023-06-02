import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Insira um número presente na matriz: ");
        int numPosition = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (numPosition == mat[i][j]) {
                    System.out.println("Posição: " + i + ", " + j);
                    System.out.println("-----------------------------------------------------");
                    if (j < mat[i].length - 1)
                        System.out.println("Direita: " + mat[i][j + 1]);

                    if (j > 0)
                        System.out.println("Esquerda: " + mat[i][j - 1]);

                    if (i > 0) 
                        System.out.println("Cima: " + mat[i - 1][j]);

                    if (i < mat.length - 1)
                        System.out.println("Baixo: " + mat[i + 1][j]);

                        System.out.println("-----------------------------------------------------");
                }
            }

        }

        sc.close();
    }
}
