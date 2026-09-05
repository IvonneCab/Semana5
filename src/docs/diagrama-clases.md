# Diagrama de Clases - Semana 6 (Clases Abstractas)

```mermaid
classDiagram
    class Persona {
        <<abstract>>
        #String nombre
        #String dui
        +presentarse() String
        +calcularBeneficioAnual()* double
    }

    class Cliente {
        -String telefono
        -double comprasAnuales
        +calcularBeneficioAnual() double
    }

    class Empleado {
        -double salario
        +calcularBeneficioAnual() double
    }

    class Estudiante {
        -String carnet
        -String carrera
        -double promedio
        +calcularBeneficioAnual() double
    }

    class Docente {
        -String especialidad
        -int aniosExperiencia
        +calcularBeneficioAnual() double
    }

    class Voluntario {
        -double horasServicio
        +calcularBeneficioAnual() double
        +toString() String
    }

    class Proveedor {
        -double montoFacturado
        +calcularBeneficioAnual() double
        +toString() String
    }

    Persona <|-- Cliente
    Persona <|-- Empleado
    Persona <|-- Estudiante
    Persona <|-- Docente
    Persona <|-- Voluntario
    Persona <|-- Proveedor