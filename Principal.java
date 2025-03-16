import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);
        ContainerRect contenedor = new ContainerRect(5);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n🔹 Ingrese datos para el rectángulo " + (i + 1) + ":");

            System.out.print("Ingrese una esquina (x y): ");
            Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

            System.out.print("Ingrese la esquina opuesta (x y): ");
            Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

            Rectangulo rectangulo = new Rectangulo(c1, c2);

            if (!contenedor.addRectangulo(rectangulo)) {
                break;
            }
        }

        System.out.println("\n📌 Rectángulos almacenados:");
        System.out.println(contenedor);

        scanner.close();
    }
}