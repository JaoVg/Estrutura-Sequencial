import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste6 {
   
    public static void main(String[] args){

        System.out.println("Digite o raio da circunferencia:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double raio = entrada.nextDouble();

        double Pi = 3.14;

        raio = raio * raio;

        double area = Pi * raio;

        System.out.println("Area da circunferencia é: " +area);
    }
}