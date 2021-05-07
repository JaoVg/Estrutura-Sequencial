import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste8 {
   
    public static void main(String[] args){

        System.out.println("Digite suas horas trabalhadas:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double horas = entrada.nextDouble();

        System.out.println("Digite quanto recebe por hora:");

        entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        double valor = entrada.nextDouble();

        double salario = horas * valor;

        salario = salario * 22;

        System.out.println("Seu salário é: " +salario);
    }
}
