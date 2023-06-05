package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calcMaior {
    
    public static int calculaMaior(int[] n){

        int i,r;
        r=n[0];
        for(i=0;i<n.length;i++){
           if (n[i]>r) r=n[i]; 
        };
        return r;
    }



    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        int i,n;
        
        System.out.println("Digite o numero de elementos do vetor: ");
        n = in.nextInt();
        
        int num[]=new int [n];

        for(i=0;i<n;i++){
            
            try{
            System.out.println("Digite o valor do indice " + i+":");
            num[i] = in.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("valor inválido, digite novamente: ");
                i--;
                in.nextLine();
            }
         };

        System.out.println("maior dos elementos: " + calculaMaior(num));

        in.close();
    } catch (Exception e){ System.out.println("ferrou "); }

    }
}