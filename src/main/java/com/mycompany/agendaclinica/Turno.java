
package com.mycompany.agendaclinica;

public class Turno {
    private String idPaciente;
    private String nombrePaciente;
    private String fecha;
    private String hora;
    private String medico;

    public Turno(String idPaciente, String nombrePaciente, String fecha, String hora, String medico) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.hora = hora;
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void mostrarTurno() {
        System.out.println("ID: " + idPaciente + " | Nombre: " + nombrePaciente +
                " | Fecha: " + fecha + " | Hora: " + hora + " | Médico: " + medico);
    }
}
