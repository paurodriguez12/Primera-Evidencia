import java.util.Scanner;

public class Cuadrado {
    public static void main (String[] args) {
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

        System.out.println("Ingresa el valor de un lado del cuadrado: ");
        //TODO: Guardar vlr ingresado en la variable lado

        Scanner entrada = new Scanner(System.in);
        double lado = entrada.nextDouble();

        //TODO: Calcular el area del cuadrado
        double area = lado * lado;

        //TODO: Calcular el perimetro del cuadrado
        double perimetro = 4 * lado;

        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El perimetro del cuadrado es: " + perimetro);

    }
}
