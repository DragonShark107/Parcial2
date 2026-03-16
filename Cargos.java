

/**
 * Contiene los cargos profesionales válidos de la empresa.
 */
public class Cargos {
        /** Cargo de desarrollador */
    public static final String DESARROLLADOR = "Desarrollador";
        /** Cargo de diseñadora */
    public static final String DISENADORA = "Diseñadora";
        /** Cargo de gerente */
    public static final String GERENTE = "Gerente";

        /** Lista de todos los cargos válidos */
    public static final String[] LISTA = { DESARROLLADOR, DISENADORA, GERENTE };

        /**
         * Verifica si un cargo es válido según la lista de cargos.
         * @param cargo Cargo a comprobar
         * @return true si el cargo es válido, false en caso contrario
         */
    public static boolean esCargoValido(String cargo) {
        for (String c : LISTA) {
            if (c.equals(cargo)) {
                return true;
            }
        }
        return false;
    }
}
