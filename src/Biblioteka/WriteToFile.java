package Biblioteka;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    static int FileWrite()
    {
        try (FileWriter writer = new FileWriter("libraryBase.txt"))
        {
            System.out.println("Podaj Identyfikator czytelnika:");
            writer.write("Id czytenlika" + Books.readerId);
            System.out.println("Podaj Tytul ksiazki:");
            writer.write("Tytul" + Books.title);
            System.out.println("Podaj Autora:");
            writer.write("Autor" + Books.autor);
            System.out.println("Podaj Numer ISBN:");
            writer.write("Isbn" + Books.Isbn);
            System.out.println("Podaj ilosc:");
            writer.write("Ilosc" + Books.quantity);
            System.out.println("Podaj date wypozyczenia:");
            writer.write("Data wypozyczenia" + Books.yearOfIssue);

            System.out.println("Zapis poprawny.");


        } catch (IOException e) {

            System.out.print("Blad przy zapisie pliku:" + e.getMessage());

        }
        return 1;


    }
}
