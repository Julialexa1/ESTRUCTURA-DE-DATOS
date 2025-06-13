
package com.mycompany.tareasemana3;

// Clase principal para probar el programa
public class TareaSemana3 {
    public static void main(String[] args) {
        /*Elabore un documento PDF que contenga la definición de las clases, arrays y/o matrices
necesarias en C# o Java para manejar el registro de un estudiante 
que posea los siguientes datos (id, nombres, apellidos, dirección y tres teléfonos ).*/ 
        
        
        // Creación del array de teléfonos
        String[] telefonos = {"0987654321", "0998765432", "0976543210"};
        
        // Creación del objeto estudiante
        Estudiante estudiante = new Estudiante(1, "Julisa", "Grefa", "Caluma", telefonos);
        
        // Mostrar los datos
        estudiante.mostrarDatos();
    }
}