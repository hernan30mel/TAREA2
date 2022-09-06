import java.util.Scanner;

public class Temperaturas
{
    public static void main(String args[])
    {

        double celsius;

        double fahrenheit;

        double rankine;

        double kelvin;

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n         CONVIERTIR TEMPERATURAS\n");

        // Leer dato
        System.out.println("----------- Lectura del dato -----------");
        System.out.print("Teclee temperatura en celsius: ");
        celsius = entrada.nextDouble();

        // Calcular
        fahrenheit = ((9/5D)* celsius +32)  ;
        kelvin = celsius + 273;
        rankine = celsius *(9/5D)+492;

        // Imprimir salida
        System.out.println("\n-------------- Resultados --------------");
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("Kelvin = " + kelvin);
        System.out.println("Rankine = " + rankine);
    }
}
