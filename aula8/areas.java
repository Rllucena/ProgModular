import java.util.Scanner;

public class areas {

        public static int area (int lado){
    
            return lado*lado;
    
        }
    
        public static double area (double base, double altura){
    
            return (base*altura)/2;
    
        }
    
        public static double area (double raio){
    
            return (Math.PI*Math.pow(raio, 2));
    
        }

        

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            double base,altura,raio;
            int lado;
    
    
            System.out.println("Digite o lado do quadrado: ");
            lado = in.nextInt();
    
            System.out.println("Digite a base do triangulo: ");
            base = in.nextDouble();
    
            System.out.println("Digite a altura do triangulo: ");
            altura = in.nextDouble();
    
            System.out.println("Digite o raio do circulo: ");
            raio = in.nextDouble();

    
            System.out.println("Area do quadrado: " +area(lado));
 
            System.out.println("Area do triangulo: "+area(base,altura)); 

            System.out.println("Area do circulo: "+area(raio));
    
            in.close();
        }
    
}
