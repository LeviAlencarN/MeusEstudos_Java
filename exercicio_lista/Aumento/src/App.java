import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Empregados> list = new ArrayList<>();

        System.out.println("Digite O numero de funcionários: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Id: ");
            Integer id = sc.nextInt();

            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            Empregados emp = new Empregados(id, nome, salario);
            list.add(emp);
        }

        System.out.println("Qual funcionário receberá aumento? escolha por id: ");
        int idSalario = sc.nextInt();

        Integer pos = Posicao(list, idSalario);

        if(pos == null){
            System.out.println("Funcionário não encontrado"); 
        }
        else{
            System.out.println("Digite o valor a ser incrementado no salário do funcionário de id " + idSalario);
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentoSalario(porcentagem);
        }

        System.out.println("Lista de funcionarios: ");
        for(Empregados emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer Posicao(List<Empregados> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
