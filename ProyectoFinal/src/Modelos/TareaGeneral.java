package Modelos;

import java.util.Date;

public class TareaGeneral extends Tarea {

  private String asunto;

  public TareaGeneral(int tarea_id, String asunto, Date fechaVencimiento, Empleado empleadoResponsable, String comentario, String estado, Empleado empleado) {
    setTarea_id(tarea_id);
    this.asunto = asunto;
    this.setFechaVencimiento(fechaVencimiento);
    this.setEmpleadoResponsable(empleadoResponsable);
    this.setComentario(comentario);
    this.setEstado(estado);
    this.setEmpleado(empleado);
  }

  public String getAsunto() {
    return asunto;
  }
  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

}