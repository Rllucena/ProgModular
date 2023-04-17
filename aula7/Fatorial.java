import java.util.Scanner;

public class Fatorial {
    
    public static int fatorial(int n){

        int i,r=1;

        for(i=1;i<=n;i++){
           r=i*r; 
        }
        return r;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        

        System.out.println("Digite um numero: ");
        num = in.nextInt();
        
        System.out.println("Fatorial: " + fatorial(num));

        in.close();
    }

}
