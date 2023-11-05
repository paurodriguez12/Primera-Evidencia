import java.util.Scanner;

public class Suma {
    public static void main (String[] args){
    //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

    System.out.println("Ingresa el primer sumando: ");
    //TODO: Guardar vlr ingresado en la variable num1

    Scanner entrada = new Scanner(System.in);
    int num1 = entrada.nextInt();

    System.out.println("Ingresa el segundo sumando: ");
    //TODO: Guardar vlr ingresado en la variable num2

    int num2 = entrada.nextInt();

    //TODO: Calcular el total
    int total = num1 + num2;

    //TODO: Salida mostrar el total de la suma
    System.out.println("El total de la suma es igual a " + total );


    }
}
