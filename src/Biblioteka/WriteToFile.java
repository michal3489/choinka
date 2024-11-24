package Biblioteka;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
    public static void writeToFile(String content, String text){
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test.txt", true))) {
            writer.write(content);
            writer.newLine(); 
            writer.flush(); // Ensure the content is written to the file
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }




}
