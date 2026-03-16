# Testing de Caja Negra: Clase Empleado

## Criterios de aceptación
- **nombre**: No vacío y debe contener más de una palabra.
- **cargo**: Debe estar dentro de los valores definidos en la clase `Cargos`.
- **salario**: No vacío, no negativo, y no por debajo del convenio salarial (se asume 15000 como salario mínimo de convenio).

---

## Tabla 1: Análisis de los parámetros
| Parámetro | Criterio de aceptación | Ejemplo válido | Ejemplo no válido |
|-----------|-----------------------|----------------|-------------------|
| nombre    | No vacío, más de una palabra | "Juan Pérez" | "Juan", "" |
| cargo     | Uno de los definidos en Cargos | "Desarrollador" | "Jefe", "" |
| salario   | >= 15000, no negativo, no vacío | 20000 | -500, 0, 10000, "" |

---

## Tabla 2: Casos válidos
| Caso | nombre         | cargo           | salario | Resultado esperado |
|------|---------------|-----------------|---------|-------------------|
| 1    | "Ana López"   | "Gerente"      | 20000   | Aceptado          |
| 2    | "Luis García" | "Diseñadora"   | 30000   | Aceptado          |
| 3    | "Pedro Ruiz"  | "Desarrollador"| 15000   | Aceptado          |

---

## Tabla 3: Casos no válidos
| Caso | nombre      | cargo         | salario | Motivo de rechazo                |
|------|-------------|--------------|---------|----------------------------------|
| 1    | "Juan"     | "Gerente"   | 20000   | Nombre no tiene más de una palabra|
| 2    | ""         | "Gerente"   | 20000   | Nombre vacío                     |
| 3    | "Ana López"| "Jefe"      | 20000   | Cargo no permitido               |
| 4    | "Ana López"| ""          | 20000   | Cargo vacío                      |
| 5    | "Ana López"| "Gerente"   | -500    | Salario negativo                 |
| 6    | "Ana López"| "Gerente"   | 0       | Salario cero                     |
| 7    | "Ana López"| "Gerente"   | 10000   | Salario por debajo de convenio   |
| 8    | "Ana López"| "Gerente"   | ""      | Salario vacío                    |
