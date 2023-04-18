import java.util.Scanner;

public class conta {

    public static int contar (String s1){

        return s1.length();

    }

    public static int contar (char[] a){

        return a.length;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1="aulas";
        char[] array = {'c', 'a','s','a'};
        
        System.out.println("Primeira palavra: "+contar(s1));
        System.out.println("Segunda palavra: "+contar(array));




        in.close();
}
    
}
