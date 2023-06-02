public class Config {
    public double a;
    public double b;

    public Config(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double calc(){
        return (b * a)/2;
    }
}
