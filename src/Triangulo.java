import java.util.Scanner;

public class Triangulo {
    public static void main (String[] args) {
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

        System.out.println("Ingresa la base del triangulo: ");
        //TODO: Guardar vlr ingresado en la variable base

        Scanner entrada = new Scanner(System.in);
        double base = entrada.nextDouble();

        System.out.println("Ingresa la altura del triangulo: ");
        //TODO: Guardar vlr ingresado en la variable altura
        double altura = entrada.nextDouble();

        double area = (base * altura)/2 ;
        // calcular el area

        System.out.println("El area del triangulo es: " + area );
        // Mostrar el area calculada

    }
}
