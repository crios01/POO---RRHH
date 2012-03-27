package Modelos;

import java.util.Date;

public class DeclaracionJurada extends Tarea {

  private String cargo;
  private Date fechaAsumpcion;
  private String tipo;
  private Date fechaReferencia;
  private Date fechaPublicacion;
  private Date fechaDocumento;
  private String numeroDocumento;

  public DeclaracionJurada(String cargo, Date fechaAsumpcion, String tipo, Date fechaReferencia, Date fechaPublicacion, Date fechaDocumento, String numeroDocumento) {
    this.cargo = cargo;
    this.fechaAsumpcion = fechaAsumpcion;
    this.tipo = tipo;
    this.fechaReferencia = fechaReferencia;
    this.fechaPublicacion = fechaPublicacion;
    this.fechaDocumento = fechaDocumento;
    this.numeroDocumento = numeroDocumento;
  }

  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Date getFechaAsumpcion() {
    return fechaAsumpcion;
  }
  public void setFechaAsumpcion(Date fechaAsumpcion) {
    this.fechaAsumpcion = fechaAsumpcion;
  }

  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Date getFechaReferencia() {
    return fechaReferencia;
  }
  public void setFechaReferencia(Date fechaReferencia) {
    this.fechaReferencia = fechaReferencia;
  }

  public Date getFechaPublicacion() {
    return fechaPublicacion;
  }
  public void setFechaPublicacion(Date fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  public Date getFechaDocumento() {
    return fechaDocumento;
  }
  public void setFechaDocumento(Date fechaDocumento) {
    this.fechaDocumento = fechaDocumento;
  }

  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

}