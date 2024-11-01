package Biblioteka;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Podaj tytul nowej ksiazki: ");
        Scanner scanner = new Scanner(Books.title);


        try(FileWriter writer = new FileWriter("libraryBase.txt")){

            writer.write();

        }




    }
}