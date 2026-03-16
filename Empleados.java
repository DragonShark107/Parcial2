
/**
 * Representa un empleado de la empresa.
 */
class Empleado {
    /** Nombre completo del empleado */
    private String nombre;
    /** Cargo profesional del empleado */
    private String cargo;
    /** Salario actual del empleado */
    private double salario;


    /**
     * Crea un nuevo empleado con nombre, cargo y salario.
     * @param nombre Nombre completo del empleado
     * @param cargo Cargo profesional (debe estar en Cargos)
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre Nombre completo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo profesional del empleado.
     * @return Cargo profesional
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo profesional del empleado.
     * @param cargo Cargo profesional
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     * @return Salario actual
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * @param salario Nuevo salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en texto del empleado.
     * @return Cadena con los datos del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}


class Empleados {
    /** Array que almacena los empleados */
    public Empleado[] lista;
    /** Número de empleados dados de alta */
    private int contador;

    /**
     * Crea una nueva lista de empleados con capacidad máxima.
     * @param capacidad Número máximo de empleados
     */
    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.contador = 0;
    }

    /**
     * Da de alta un nuevo empleado en la lista.
     * @param nombre Nombre completo
     * @param cargo Cargo profesional
     * @param salario Salario inicial
     */
    public void darDeAlta(String nombre, String cargo, double salario) {
        if (contador < lista.length) {
            lista[contador] = new Empleado(nombre, cargo, salario);
            contador++;
        } else {
            System.out.println(Textos.NO_MAS_EMPLEADOS);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            if (empleado != null) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    }

    /**
     * Muestra por pantalla la lista de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }
}