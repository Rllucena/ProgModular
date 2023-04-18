
import java.util.Scanner;

public class calculaNota {

    public static double calculaNotaFinal (double prova1, double prova2){

        return (prova1+prova2)/2;

    }

    public static double calculaNotaFinal (double prova1, double prova2, double trabalho){

        return ((prova1+prova2)*3+trabalho*4)/10;

    }

    public static double calculaNotaFinal (double prova1, int peso1, double prova2, int peso2){

        return (prova1*peso1+prova2*peso2)/(peso1+peso2);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double prova1,prova2,trabalho;
        int peso1,peso2;


        System.out.println("Digite a nota da primeira prova: ");
        prova1 = in.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        prova2 = in.nextDouble();

        System.out.println("Nota final: " +calculaNotaFinal(prova1, prova2));



        System.out.println("Digite a nota da primeira prova: ");
        prova1 = in.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        prova2 = in.nextDouble();

        System.out.println("Digite a nota do trabalho: ");
        trabalho = in.nextDouble();

        System.out.println("Nota final: " +calculaNotaFinal(prova1, prova2,trabalho));




        System.out.println("Digite a nota da primeira prova: ");
        prova1 = in.nextDouble();

        System.out.println("Digite o peso da primeira prova: ");
        peso1 = in.nextInt();

        System.out.println("Digite a nota da segunda prova: ");
        prova2 = in.nextDouble();

        System.out.println("Digite o peso da segunda prova: ");
        peso2= in.nextInt();

        System.out.println("Nota final: " +calculaNotaFinal(prova1, peso1, prova2, peso2));

        in.close();
    }
}

