import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Circulo {
    public static void main(String[] args) {
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el radio de la circunferencia (en CM): ");
        //TODO: Guardar vlr, ingresado en la variable r

        String entradaradio = entrada.nextLine();
        double r = obtenerValorNumerico(entradaradio);

        //TODO: Formula para calcular la longitud de la circunferencia
        double Longitud = 2 * Math.PI * r;

        //TODO: Mostrar la longitud calculada
        System.out.println("La longitud de la circunferencia es " + formatearResultado(Longitud, "cm"));

        //TODO: Formula para calcular el area del circulo
        double Area = Math.PI * Math.pow(r, 2);

        //TODO: Mostrar la longitud calculada
        System.out.println("El area del circulo es " + formatearResultado(Area, "cm^2"));

    };

    //TODO: Obtener vlr numerico de la cadena de texto
    private static double obtenerValorNumerico(String entrada){
        Pattern patron = Pattern.compile("([0-9.]+) \\s*([a-zA-Z]+)");
        Matcher miAnalizador = patron.matcher(entrada);

        //TODO: Condicional Doble
        if (miAnalizador.matches()) {
            double valor = Double.parseDouble(miAnalizador.group(1));
            return valor;
        }else {
            throw new IllegalArgumentException("Entrada no valida ,debe contener un valor y la unidad CM.");
        }
    }
    //TODO: Formatear el resultado con la unidad
    private static String formatearResultado(double valor, String unidad) {
        return String.format("%.2f %s" , valor,unidad);
    }

}
