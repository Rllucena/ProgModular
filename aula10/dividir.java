package aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dividir {
    
    public static double divisao (int a, int b) throws ArithmeticException{
        return (double)a/(double)b;
    }


public static void main(String[] args) {
    
        Scanner in= new Scanner(System.in);
        int a=0,b=0,i=0;
        double c;

        while(i==0){
        try{System.out.println("Digite o numerador: ");
        a = in.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("valor inválido, digite novamente: ");
            in.nextLine();
            i--;
        }
        i++;
        }
        i=0;

        while(i==0){
            try{System.out.println("Digite o denominador: ");
            b = in.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("valor inválido, digite novamente: ");
                in.nextLine();
                i++;
            }
            i--;
            }

        try{
            c=divisao(a, b);
            System.out.println("resultado: " + c);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitida");
        }


        in.close();
}
}