
import java.util.Scanner;


public class ordAlfabetica {
    
    
    public static String ordemAlfabetica (String s1,String s2 ){
        
        String s3,s4;
        s3=s1.toLowerCase();
        s4=s2.toLowerCase();
        if(s3.compareTo(s4)>0) return s2+" "+s1;
                
        return s1+" "+s2;
        

    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1,s2;
        
        System.out.println("Digite a primeira palavra: ");
        s1 = in.next();

        System.out.println("Digite a segunda palavra: ");
        s2 = in.next();
        
        System.out.println(ordemAlfabetica(s1,s2));

        in.close();
    }
}


