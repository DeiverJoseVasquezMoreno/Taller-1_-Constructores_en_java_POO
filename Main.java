import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500);
        System.out.println(libro1);

        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0, "Ahorros");
        System.out.println(cuenta1);

        Estudiante estudiante1 = new Estudiante("Juan", 20, "Informática");
        System.out.println(estudiante1);

        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas:");
        int numeroPaginas = scanner.nextInt();
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);
        System.out.println(libro2);

        scanner.close();
    }
}
