

package com.mycompany.agendaclinica;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaClinica {
private ArrayList<Turno> turnos;

    public AgendaClinica() {
        turnos = new ArrayList<>();
    }

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public void mostrarTodosLosTurnos() {
        System.out.println("Turnos registrados:");
        for (Turno t : turnos) {
            t.mostrarTurno();
        }
    }

    public void buscarTurnosPorFecha(String fecha) {
        System.out.println("Turnos para la fecha: " + fecha);
        for (Turno t : turnos) {
            if (t.getFecha().equals(fecha)) {
                t.mostrarTurno();
            }
        }
    }

    public static void main(String[] args) {
        AgendaClinica agenda = new AgendaClinica();

        // Datos predefinidos
        agenda.agregarTurno(new Turno("001", "Carlos Méndez", "2025-06-20", "09:00", "Dra. Rivas"));
        agenda.agregarTurno(new Turno("002", "Ana Salazar", "2025-06-20", "10:30", "Dr. Páez"));
        agenda.agregarTurno(new Turno("003", "Luis Torres", "2025-06-21", "11:00", "Dra. Rivas"));

        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Ver todos los turnos");
                System.out.println("2. Buscar turnos por fecha");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1 -> agenda.mostrarTodosLosTurnos();
                    case 2 -> {
                        System.out.print("Ingrese la fecha (YYYY-MM-DD): ");
                        String fecha = sc.nextLine();
                        agenda.buscarTurnosPorFecha(fecha);
                    }
                    case 3 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }

            } while (opcion != 3);
        }
    }
}
