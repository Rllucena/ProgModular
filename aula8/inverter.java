
import java.util.Scanner;

public class inverter {
    
    public static String inverte (String s1){
      
        String s1inv="";
            for (int i = s1.length()-1; i >= 0; i--){
                s1inv = s1inv+s1.charAt(i);

            }
        return s1inv;

    }

    public static String inverte (String s1,int inicio, int fim){
      
        if(fim<inicio) return "erro";
        String s1inv="";
        int i=0;
        while(i<s1.length()){

            if((i<inicio)||(i>fim)) s1inv = s1inv+s1.charAt(i);
            else{
            for (i = fim; i >= inicio; i--){
                s1inv = s1inv+s1.charAt(i);
            }
            i=fim;
        }
        i++;
    }
        return s1inv;

    }

    public static void inverte(char[] a){

        int i;
        char inv[]=new char [a.length];;
        for(i=0;i<=a.length-1;i++){
           inv[a.length-i-1]=a[i]; 
        };

        
        for(i=0;i<a.length;i++){
            System.out.print(" " + inv[i]); 
        };
        System.out.println("");

        //printVetor(a);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1;
        int inicio, fim;
        
        System.out.println("Digite a palavra: ");
        s1 = in.next();

      //  System.out.println("Digite a segunda palavra: ");
     //   s2 = in.next();
        
        System.out.println("palavra invertida: "+inverte(s1));

        System.out.println("Digite o inicio: ");
        inicio = in.nextInt();

        System.out.println("Digite o fim: ");
        fim = in.nextInt();

        System.out.println("palavra invertida: "+inverte(s1,inicio,fim));


//        int n,i;
  //      System.out.println("Digite o numero de elementos do vetor: ");
    //    n = in.nextInt();
        
      //  char array[]=new char [n];

//        for(i=0;i<n;i++){
  //          System.out.println("Digite o valor do indice " + i+":");
    //        array[i] = in.nextChar();
      //   };
        char[] array = {'c', 'a','s','a'};
        inverte(array);

        in.close();
}
}