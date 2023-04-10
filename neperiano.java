
import java.util.Scanner;

public class neperiano {
    
    public static int fatorial(int n){

        int i,r=1;

        for(i=1;i<=n;i++){
           r=i*r; 
        }
        return r;
    }

    public static double calculaNeperiano(int n){

        int i;
        double r=0,aux;

        for(i=0;i<=n;i++){
           aux=1.0/fatorial(i);
           r=r+aux; 
          // System.out.println("iteração: " + i);
          // System.out.println("fatorial: " +aux);
          // System.out.println("resultado: " +r);
        }
        //System.out.println("iterações: " + i);
        return r;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        

        System.out.println("Digite o numero de termos: ");
        num = in.nextInt();
        
        System.out.println("Numero neperiano: " + calculaNeperiano(num));

        in.close();
    }

}