import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Levi");     
        list.add("Lucas");     
        list.add("Chico");     
        list.add("Livia");

        
        list.removeIf(x -> x.charAt(0) == 'C');

        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);
    }
}
