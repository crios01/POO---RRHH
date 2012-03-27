package Modelos;

public class TipoTarea {

  private String tipotarea_id;
  private String descripcion;

  public String getTipotarea_id() {
    return tipotarea_id;
  }

  public void setTipotarea_id(String tipotarea_id) {
    this.tipotarea_id = tipotarea_id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  private boolean notificacion = false;

  public boolean isNotificacion() {
    return notificacion;
  }

  public void setNotificacion(boolean notificacion) {
    this.notificacion = notificacion;
  }
  
  private boolean recordatorio = false;

  public boolean isRecordatorio() {
    return recordatorio;
  }

  public void setRecordatorio(boolean recordatorio) {
    this.recordatorio = recordatorio;
  }
  
  /**
   * Define la frecuencia (en horas) con la que se va a enviar las notificaciones y recordatorios
   * @uml.property name="frecuenciaHoras"
   */
  private int frecuenciaHoras = 24;

  public int getFrecuenciaHoras() {
    return frecuenciaHoras;
  }

  public void setFrecuenciaHoras(int frecuenciaHoras) {
    this.frecuenciaHoras = frecuenciaHoras;
  }
}