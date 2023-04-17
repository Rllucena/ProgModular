
import java.util.Scanner;


public class ordAlfabetica {
    
    
    public static String ordemAlfabetica (String s1,String s2 ){
        s1=s1.toLowerCase;
        s2=s1.toLowerCase;
        if(s1.compareTo(s2)>0) return s1+s2;
                
        return s2+s1;
        

    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1,s2;
        
        System.out.println("Digite a primeira palavra: ");
        s1 = in.nextString();

        System.out.println("Digite a segunda palavra: ");
        s2 = in.nextString();
        
        System.out.println(ordemAlfabetica(s1,s2));

        in.close();
    }
}

