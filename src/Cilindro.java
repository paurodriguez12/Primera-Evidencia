import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cilindro {
    public static void main(String[] args) {
        //TODO: Crear objeto tipo Scanner para recibir datos desde la consola
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la altura del cilindro (en CM): ");
        //TODO: Guardar vlr, ingresado en la variable Altura

        String entradaAltura = entrada.nextLine();
        double h = obtenerValorNumerico(entradaAltura);

        System.out.println("Ingresa el radio del cilindro (en CM): ");
        //TODO: Guardar vlr, ingresado en la variable radio

        String entradaRadio = entrada.nextLine();
        double r = obtenerValorNumerico(entradaRadio);

        //TODO: Formula para calcular area del cilindro
        double Area = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;

        System.out.println("El area del cilindro es " + formatearResultado(Area, "cm^2"));

        //TODO: Formula para calcular volumen del cilindro
        double Volumen = Math.PI * Math.pow(r, 2) * h;

        System.out.println("El volumen del cilindro es " + formatearResultado(Volumen, "cm^3"));

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
        //TODO: Formatear el resultado con la unidad cm^2
            private static String formatearResultado(double valor, String unidad) {
                return String.format("%.2f %s" , valor,unidad);
            }

}
