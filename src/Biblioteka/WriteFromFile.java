package Biblioteka;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteFromFile {
    public static void Reader(){
        try (BufferedReader br = new BufferedReader(new FileReader("biblioteka.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}