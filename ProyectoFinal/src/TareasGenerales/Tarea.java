package TareasGenerales;

import java.sql.Timestamp;

public class Tarea {

  String codigo;
  String asunto;
  Timestamp fechav;
  String responsable;
  String comentario;

  public Tarea(String codigo, String asunto, Timestamp fechav, String responsable,
          String comentario) {
    this.codigo = codigo;
    this.asunto = asunto;
    this.fechav = fechav;
    this.responsable = responsable;
    this.comentario = comentario;

  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getAsunto() {
    return asunto;
  }

  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

  public Timestamp getFechav() {
    return fechav;
  }

  public void setFechav(Timestamp fechav) {
    this.fechav = fechav;
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
}
