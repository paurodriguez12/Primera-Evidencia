import java.util.Scanner;

public class ElevadoCuadrado {
    public static void main (String[] args){
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

        System.out.println("Ingresa un numero: ");
        //TODO: Guardar vlr ingresado en la variable num

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        //TODO: Calcular el numero elevado al cuadrado
        int elevadocuadrado = num + num ;

        //TODO: Salida mostrar el numero elevado al cuadrado
        System.out.println("El numero " + num + " elevado al cuadrado es " + elevadocuadrado);


    }
}
