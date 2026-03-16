# Sistema de Gestión de Empleados

## Descripción general
Este proyecto es una aplicación Java sencilla para la gestión de empleados en una empresa. Permite dar de alta empleados, aumentar su salario en bloque y mostrar la lista de empleados. El sistema utiliza buenas prácticas de encapsulamiento, constantes para textos y cargos, y está documentado con JavaDoc.

## Estructura del código
- **Empleado**: Clase que representa a un empleado con nombre, cargo y salario.
- **Empleados**: Clase que gestiona una lista de empleados y permite operaciones como alta, aumento de salario y listado.
- **Cargos**: Clase con los cargos profesionales válidos de la empresa.
- **Textos**: Clase con los textos fijos usados en la aplicación para facilitar traducción y mantenimiento.
- **SistemaGestionEmpleados**: Clase principal con el método `main` que ejecuta el flujo de la aplicación.

## Tests y validación
El análisis de caja negra está documentado en `TESTING.md`.

### Pruebas realizadas
- Se validó manualmente la creación de empleados con datos válidos y no válidos.
- Se comprobó que el aumento de salario funciona correctamente.
- Se verificó que los textos fijos y cargos solo permiten valores válidos.
- El método mostrarEmpleados imprime correctamente la lista.
- El código compila y ejecuta sin errores.

### Ejemplo de ejecución
```
Introduzca el porcentaje de aumento de salario: 10
Lista de Empleados:
Empleado{nombre='Juan', cargo='Desarrollador', salario=55000.0}
Empleado{nombre='María', cargo='Diseñadora', salario=49500.0}
Empleado{nombre='Pedro', cargo='Gerente', salario=66000.0}
```

## Autoría y versión
- **Autor**: Izan Valverde Marin
- **Versión**: 1.0
- **Fecha**: Marzo 2026

## Uso
1. Compila los archivos Java:
   ```
   javac Empleados.java Cargos.java Textos.java SistemaGestionEmpleados.java
   ```
2. Ejecuta la aplicación:
   ```
   java SistemaGestionEmpleados
   ```

## Notas
- El código está documentado con JavaDoc para facilitar su mantenimiento y comprensión.
- Los textos y cargos están centralizados para evitar errores y facilitar futuras traducciones.
