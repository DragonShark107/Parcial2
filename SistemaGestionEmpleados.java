

import java.util.Scanner; 

/**
 * Clase principal que gestiona la aplicación de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal. Inicializa la gestión de empleados y ejecuta el flujo principal del programa.
     * @param args Argumentos de línea de comandos (no usados)
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.darDeAlta("Juan", Cargos.DESARROLLADOR, 50000);
        empleados.darDeAlta("María", Cargos.DISENADORA, 45000);
        empleados.darDeAlta("Pedro", Cargos.GERENTE, 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
