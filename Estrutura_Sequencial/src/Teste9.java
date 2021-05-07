import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste9 {
   
    public static void main(String[] args){

        System.out.println("Digite a temperatura em  Fahrenheit:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double F = entrada.nextDouble();

        double C = (F-32) / 1.8;

        System.out.println("Convertendo para celsius são: " +C);
    }
}