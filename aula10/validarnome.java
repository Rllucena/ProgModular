package aula10;

public class validarnome {
    public static void validarNome(String nome) throws new NomeInvalidoException;{
        for( int i=0; i<nome.lenght(); i++){
            nome.Caracter.isLetter(i);
        }
    }

    public static int contarPalavras(String nome) throws new StringVaziaException;{
        for( int i=0; i<nome.lenght(); i++){
            nome.Caracter.isLetter(i);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String s1;
        
        System.out.println("Digite o nome do vivente: ");
        s1 = in.next();

        //System.out.println("Digite a segunda palavra: ");
        //s2 = in.next();
        
       try{
        validarNome(s1);
        System.out.println("O nome tem "+contarPalavras(s1)+" palavras" );
       } 
       catch (NomeInvalidoException e) { System.out.println("Erro: Nome contém caracteres inválidos");  }
       catch (StringVaziaException er) {System.out.println("Erro: O nome não pode estar vazio");}


        in.close();


    }

}
