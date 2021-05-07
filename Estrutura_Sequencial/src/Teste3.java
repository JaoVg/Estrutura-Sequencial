import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teste3 {
   
    public static void main(String[] args){
        
        int numero1; // Definndo variaveis

        int numero2;

        System.out.println("Digite um número:"); // Instrução ao usuário
        
        Scanner entrada = new Scanner(System.in); // Lendo usuário
        
        numero1 = entrada.nextInt(); // Atribuindo entrada á variavel

        System.out.println("Digite outro número:"); // Instrução ao usuário
        
        entrada = new Scanner(System.in); // Lendo usuário

        numero2 = entrada.nextInt(); // Atribuindo entrada á variavel

        int numero3 = numero1 + numero2; //Soma de variáveis

        System.out.println("A soma de seus números é: " +numero3); //Retorno ao usuário
    }
}

