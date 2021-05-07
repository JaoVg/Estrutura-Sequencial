import java.io.BufferedReader; // "Bibliotecas" do java
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Locale;

public class Teste4 {
   
    public static void main(String[] args){

        System.out.println("Digite sua primeira nota: "); // Instrução ao usuário
        
        Scanner entrada = new Scanner(System.in); //Lendo numero do usuário

        entrada.useLocale(Locale.US); //Só pra deixar igual o jeito como o usuário escreve e recebe (já que a média mostrada usa um ponto, não vírugla)
        
        float numero1 = entrada.nextFloat(); // Atribuindo entrada á média

        System.out.println("Digite sua segunda nota: "); // Instrução ao usuário
        
        entrada = new Scanner(System.in); // Atribuindo entrada á média

        entrada.useLocale(Locale.US);//Só pra deixar igual o jeito como o usuário escreve e recebe (já que a média mostrada usa um ponto, não vírugla)

        float numero2 = entrada.nextFloat(); //Lendo numero do usuário

        System.out.println("Digite sua terceira nota: "); // Instrução ao usuário
        
        entrada = new Scanner(System.in); //Lendo numero do usuário

        entrada.useLocale(Locale.US);//Só pra deixar igual o jeito como o usuário escreve e recebe (já que a média mostrada usa um ponto, não vírugla)

        float numero3 = entrada.nextFloat(); // Atribuindo entrada á média

        System.out.println("Digite sua quarta nota: "); // Instrução ao usuário
        
        entrada = new Scanner(System.in); //Lendo numero do usuário

        entrada.useLocale(Locale.US);//Só pra deixar igual o jeito como o usuário escreve e recebe (já que a média mostrada usa um ponto, não vírugla)

        float numero4 = entrada.nextFloat(); // Atribuindo entrada á média

        float numero5 = numero1 + numero2 + numero3 + numero4; // Soma das notas

        numero5 = numero5/4; // média das notas

        System.out.println("A sua média é: " +numero5); //Retorno ao usuário
    }
}