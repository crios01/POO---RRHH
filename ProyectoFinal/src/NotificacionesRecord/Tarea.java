package NotificacionesRecord;

import java.util.Date;

public class Tarea {

  private int tarea_id;
  private String asunto;
  private Date fecha_vcto;
  private String responsable;
  private String comentario;
  private String estado;

  public Tarea(int tarea_id, String asunto, Date fecha_vcto, String responsable, String comentario, String estado) {
    this.setTarea_id(tarea_id);
    this.setAsunto(asunto);
    this.setFecha_vcto(fecha_vcto);
    this.setResponsable(responsable);
    this.setComentario(comentario);
    this.setEstado(estado);
  }

  public int getTarea_id() {
    return tarea_id;
  }

  public void setTarea_id(int tarea_id) {
    this.tarea_id = tarea_id;
  }

  public String getAsunto() {
    return asunto;
  }

  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

  public Date getFecha_vcto() {
    return fecha_vcto;
  }

  public void setFecha_vcto(Date fecha_vcto) {
    this.fecha_vcto = fecha_vcto;
  }

  public String getResponsable() {
    return responsable;
  }

  public void setResponsable(String responsable) {
    this.responsable = responsable;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}