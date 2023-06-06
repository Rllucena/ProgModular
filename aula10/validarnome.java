package aula10;

import java.util.Scanner;

class NomeInvalidoException extends Exception{}
class StringVaziaException  extends Exception{}

public class validarnome {
    
    public static void validarNome(String nome) throws NomeInvalidoException{
        for( int i=0; i<nome.length(); i++){
            if (!Character.isLetter(nome.charAt(i))&&!Character.isWhitespace(nome.charAt(i))){
                throw new NomeInvalidoException();
            }
        }
    }

    public static int contarPalavras(String nome) throws StringVaziaException{
         

            String [] array = nome.split("\\s+");
            return array.length;

        
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String s1;
        
        System.out.println("Digite o nome do vivente: ");
        s1 = in.next();
 
       try{
        validarNome(s1);
        System.out.println("O nome tem "+contarPalavras(s1)+" palavras" );
       } 
       catch (NomeInvalidoException e) { System.out.println("Erro: Nome contém caracteres inválidos");  }
       catch (StringVaziaException er) {System.out.println("Erro: O nome não pode estar vazio");}


        in.close();


    }

}
