import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ProyectoD {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Listado de frases románticas
        String[] frases = {
            "Eres el motivo por el que sonrío sin razón.",
            "Como tu dulzura, no hay otra... ni en la panadería.",
            "Si fueras un postre, serías el más irresistible.",
            "Contigo, hasta un simple helado sabe a cielo.",
            "No hay flan que se derrita más que yo al verte.",
            "Tu presencia es como un toque de canela en mi vida.",
            "Después de ti, ya nada me sabe igual."
        };

        // Cuenta regresiva para el cumpleaños de Ruth
        LocalDate hoy = LocalDate.now();
        LocalDate cumpleRuth = LocalDate.of(hoy.getYear(), 4, 16);
        if (hoy.isAfter(cumpleRuth)) {
            cumpleRuth = cumpleRuth.plusYears(1);
        }
        long dias = ChronoUnit.DAYS.between(hoy, cumpleRuth);

        // Mostrar el mensaje de la cuenta regresiva
        System.out.println("Faltan " + dias + " días para el cumpleaños de Ruth. ¡A prepararse para la celebración!");

        // Lista de postres
        ArrayList<String> postres = new ArrayList<>();
        System.out.println("Escribe tres postres que te gustaría regalarle a Ruth");

        // Captura de los tres postres
        for (int i = 1; i <= 3; i++) {
            System.out.println("Postre " + i + ": ");
            String postre = scanner.nextLine();
            postres.add(postre);
        }

        // Menú interactivo de postres
        int eleccion;
        do {
            System.out.println("Elige tu postre favorito: ");
            System.out.println("1. Helado de vainilla");
            System.out.println("2. Pastel de chocolate");
            System.out.println("3. Tarta de fresa");
            System.out.println("4. Flan de coco");
            System.out.println("0. Salir");

            System.out.println("Tu elección: ");
            System.out.println("Tu elección: ");
                try {
                    eleccion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                } catch (Exception e) {
                    System.out.println("¡Oops! Eso no es un número. Intenta de nuevo.");
                    scanner.nextLine(); // Limpiar la entrada incorrecta
                    eleccion = -1; // Valor inválido para que se repita el menú 
                }


            // Estructura del menú con elección
            switch (eleccion) {
                case 1:
                    System.out.println("¡Aquí tienes tu helado de vainilla!");
                    break;
                case 2:
                    System.out.println("¡Pastel de chocolate para el más dulce de todos: Tú!");
                    break;
                case 3:
                    System.out.println("¡Tarta de fresa, tan tentadora como tu sonrisa!");
                    break;
                case 4:
                    System.out.println("¡Flan de coco, como un beso tropical!");
                    break;
                case 0:
                    System.out.println("Saliste del menú, pero el postre de mi cariño siempre estará servido para ti.");
                    break;
                default:
                    System.out.println("No reconocí tu elección, pero igual te sirvo amor en bandeja. <3");
                    break;
            }

            // Mostrar una frase romántica si no saliste del menú
            if (eleccion != 0) {
                int indice = random.nextInt(frases.length);
                System.out.println("Te la dedico a ti: " + frases[indice]);
            }

        } while (eleccion != 0);

        // Mostrar los postres que se quieren regalar a Ruth
        System.out.println("Los postres que le regalarías a Ruth son:");
        for (String p : postres) {
            System.out.println("- " + p);
        }

        // Despedida final
        System.out.println("Gracias por jugar con nosotros, que tu amor y dulzura sigan creciendo.");

        // Cerrar el scanner
        scanner.close();
    }
}
