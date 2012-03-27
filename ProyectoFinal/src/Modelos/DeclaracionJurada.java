package Modelos;

import java.util.Date;
import DeclaracionesJuradas.AdminDeclaracionJurada;

public class DeclaracionJurada extends Tarea {

  private String cargo;
  private Date fechaAsumpcion;
  private String tipo;
  private Date fechaReferencia;
  private Date fechaPublicacion;
  private Date fechaDocumento;
  private String numeroDocumento;

  public DeclaracionJurada() {
    // TODO Auto-generated constructor stub
  }

  public DeclaracionJurada(String cargo, Date fechaAsumpcion, String tipo,
          Date fechaReferencia, Date fechaPublicacion, Date fechaDocumento,
          String numeroDocumento) {
    super();
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

  @Override
  public boolean adicionar() {
    if (getEmpleadoResponsable().equals("")) {
      return false;
    } else if (getFechaVencimiento().equals("")) {
      return false;
    }
    System.out.println("Agregando Tarea");
    return true;
  }

  @Override
  public boolean editar() {
    if (getEmpleadoResponsable().equals("")) {
      return false;
    } else if (getFechaVencimiento().equals("")) {
      return false;
    }
    System.out.println("Editando Tarea");
    return true;
  }

  @Override
  public boolean eliminar() {
    for (DeclaracionJurada declaracion : AdminDeclaracionJurada.resultDeclaraciones()) {
      if (declaracion.getTarea_id() == getTarea_id()) {
        System.out.println("Se Elimino");
        AdminDeclaracionJurada.resultDeclaraciones().remove(declaracion);
        return true;
      }
    }
    return false;
  }
}