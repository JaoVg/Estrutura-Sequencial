import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste7 {
   
    public static void main(String[] args){

        System.out.println("Digite a altura do quadrado:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double altura = entrada.nextDouble();

        double area = altura * altura;

        double area2 = area * 2; 

        System.out.println("Area do quadrado é: " + area);
        
        System.out.println("O dobro da area do quadrado é: " + area2);
    }
}