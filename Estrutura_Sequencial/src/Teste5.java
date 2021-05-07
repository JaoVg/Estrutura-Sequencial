import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste5 {
   
    public static void main(String[] args){

        System.out.println("Digite o valor em metros:");

        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);

        float metros = entrada.nextFloat();

        float centimetros = metros * 100;

        System.out.println("Convertendo para centimetros são: " +centimetros);
    }
}

