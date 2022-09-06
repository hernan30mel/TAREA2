package ecuacionCuadratica;
import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);

        float x1,x2;

        int a,b,c;

        System.out.println("Programa para solucionar ecuaciones cuadraticas");

        System.out.println("Ingrese el valor de a");

        a=leer.nextInt();

        System.out.println("Ingrese le valor de b");

        b=leer.nextInt();

        System.out.println("ingrese el valor de c");

        c=leer.nextInt();

        double r1,r2,r3,r4,r5,r6;

        r1 = -1*b;
        r2 = (b)^2;
        r3 = 4*(a)*(c);
        r4 = 2*(a);
        r5 = r2-1*(r3);
        r6 = Math.sqrt(r5);
        x1 = (float) ((r1+r6)/r4);
        x2 = (float) ((r1-r6)/r4);
        System.out.println("X1="+x1);
        System.out.println("X2="+x2);

    }
}
