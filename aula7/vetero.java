import java.util.Scanner;

public class vetero {
    
    public static int somaElementosVetor(int[] n){

        int i,r=0;

        for(i=0;i<n.length;i++){
           r=n[i]+r; 
        };
        return r;
    }

    public static int multiplicaElementosVetor(int[] n){

        int i,r=1;

        for(i=0;i<n.length;i++){
           r=n[i]*r; 
        };
        return r;
    }

    public static int calculaMaior(int[] n){

        int i,r;
        r=n[0];
        for(i=0;i<n.length;i++){
           if (n[i]>r) r=n[i]; 
        };
        return r;
    }

    public static int numeroRepeticaoMaior(int[] n){

        int i,r=0,aux;
        aux=calculaMaior(n);
        for(i=0;i<n.length;i++){
           if (n[i]==aux) r++; 
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,n;
        
        System.out.println("Digite o numero de elementos do vetor: ");
        n = in.nextInt();
        
        int num[]=new int [n];

        for(i=0;i<n;i++){
            System.out.println("Digite o valor do indice " + i+":");
            num[i] = in.nextInt();
         };
  
        System.out.println("soma dos elementos: " + somaElementosVetor(num));
        System.out.println("produto dos elementos: " + multiplicaElementosVetor(num));
        System.out.println("maior dos elementos: " + calculaMaior(num));
        System.out.println("repetições do maior elemento: " + numeroRepeticaoMaior(num));

        in.close();
    }

}
