import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste10 {
   
    public static void main(String[] args){

        System.out.println("Digite a temperatura em  Celsius:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double C = entrada.nextDouble();

        double F = (C * 1.8) + 32;

        System.out.println("Convertendo para Fahrenheit são: " +F);
    }
}