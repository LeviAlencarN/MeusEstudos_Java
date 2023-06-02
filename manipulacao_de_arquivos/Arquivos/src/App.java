import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
       // String[] lines = new String[] {"Good morning, Good afternoon, Good evening, Good night"};

        String path = "c:\\temp\\out.txt";
     //   try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
      //      for(String line : lines){
      //          bw.write(line);
     //           bw.newLine();
       //     }
       // }
     //   catch(IOException e){
     //       e.printStackTrace();
//        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String read = br.readLine();
            while(read != null){
                System.out.println(read);
                read = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
