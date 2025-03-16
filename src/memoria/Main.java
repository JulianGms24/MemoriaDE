package memoria;
import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empleado: "+nombre+", ID: "+id;
    }
}

public class GestionEmpleados {
    private static int contadorEmpleados = 0; // Memoria estática para el contador
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>(); // Memoria dinámica para la lista

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Empleados ---");
            System.out.println("1. Añadir Empleado");
            System.out.println("2. Mostrar Empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        } while (opcion != 3);

        scanner.close();
    }
}