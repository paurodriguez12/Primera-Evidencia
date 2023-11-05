import java.util.Scanner;

public class CovertirDolar {
    public static void main(String[] args) {
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola

        System.out.println("Ingresa en euros el valor que deseas convertir a dolares: ");
        //TODO: Guardar vlr ingresado en la variable euro

        double tasadeCambio = 1.05;

        Scanner entrada = new Scanner(System.in);
        double euro = entrada.nextDouble();

        //TODO: Calcular la conversion segun la tasa de cambio
        double dolar = (euro * tasadeCambio);

        //TODO: Salida mostrar el valor convertido en dolares
        System.out.println(euro + " euros son equivalentes a " + dolar + " dolares ");
    }
}