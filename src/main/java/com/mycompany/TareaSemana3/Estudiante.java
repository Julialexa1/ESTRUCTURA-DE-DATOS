
package com.mycompany.tareasemana3;

// Clase Estudiante para registrar los datos de un estudiante
public class Estudiante {
    
    // Atributos privados de la clase (encapsulamiento)
    @SuppressWarnings("FieldMayBeFinal")
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String[] telefonos;  // Array para almacenar los 3 teléfonos
    
    // Constructor de la clase
    public Estudiante(int id, String nombres, String apellidos, String direccion, String[] telefonos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }
    
    // Métodos getters para acceder a los datos
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String[] getTelefonos() {
        return telefonos;
    }
    
    // Método para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfonos:");
        for (String telefono : telefonos) {
            System.out.println(" - " + telefono);
        }
    }
}
