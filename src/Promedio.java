import java.util.Scanner;

public class Promedio {
    public static void main (String[] args){
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

        System.out.println("Ingresa el primer numero: ");
        //TODO: Guardar vlr ingresado en la variable num1

        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        //TODO: Guardar vlr ingresado en la variable num2
        int num2 = entrada.nextInt();

        System.out.println("Ingresa el tercer numero: ");
        //TODO: Guardar vlr ingresado en la variable num3
        int num3 = entrada.nextInt();

        //TODO: Calcular el promedio de los tres numeros ingresados por la consola
        double promedio = (num1 + num2 + num3) /3 ;

        //TODO: Salida mostrar el promedio calculado
        System.out.println("El promedio de los tres numros calculados es: " + promedio);

    }
}
