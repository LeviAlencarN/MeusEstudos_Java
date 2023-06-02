public class Pessoas {
    public String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoas(double altura){
        this.altura = altura;
    }


    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}