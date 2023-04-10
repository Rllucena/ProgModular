
import java.util.Scanner;

public class aula7 {
    
    
    public static int quociente (int a, int b){

        return a/b;
        

    }
    
    public static int resto (int a, int b){

        return a%b;
        

    }

    public static void displayDigits(int n){

        String resp = "";

        while(n>0){
            int r = resto(n, 10);
            n = quociente(n, 10);
            resp = r+ " "+ resp;
        }
        System.out.println(resp);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        
        do{
        System.out.println("Digite um numero entre 1 e 99.999: ");
        num = in.nextInt();
        
        }while ( num < 1 || num > 99999);

        displayDigits(num);

        in.close();
    }
}

