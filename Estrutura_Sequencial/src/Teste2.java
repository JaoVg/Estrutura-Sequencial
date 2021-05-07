import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teste2 {
   
    public static void main(String[] args){
        
        System.out.println("Digite um número:"); // Instrução ao usuário
        
        String nome; // Definindo variavel 
        
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in)); // Leitura de digitação do usuario
        
        try{
           
            nome = reader.readLine(); 
         
        } catch (IOException e) {
         
            e.printStackTrace();

        }

        System.out.println("O número digitado foi: " +nome); //Retorno ao usuário
    }
}
