public class Empregados {

    private Integer id;
    private String nome;
    private Double salario;

    public Empregados(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem){
        salario += (porcentagem * salario / 100);
    }

    public String toString(){
        return "Dados: \n" + "id#" + id + ": " + nome + " " + salario;
    }
}
