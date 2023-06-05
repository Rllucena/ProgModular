import java.util.Scanner;

public class modifiqueiaVetor {
    
    public static void modificaVetor(int[] n){

        int i;

        for(i=0;i<n.length;i++){
           if (i%2==0) n[i]=n[i]*2; 
           else n[i]=n[i]*3;
        };
        
    }

    public static void printVetor(int[] n){

        int i;
        
        for(i=0;i<n.length;i++){
            System.out.print(" " + n[i]); 
        };
        System.out.println("");
    }


    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int i,n;
            
            System.out.println("Digite o numero de elementos do vetor: ");
            n = in.nextInt();
            
            int num[]=new int [n];

            for(i=0;i<n;i++){
                System.out.println("Digite o valor do indice " + i+":");
                num[i] = in.nextInt();
             };
             
             printVetor(num);

             modificaVetor(num);
             printVetor(num);

            in.close();
        } catch (Exception e){ System.out.println("ferrou "); }
    }

}
