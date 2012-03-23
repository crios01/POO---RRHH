package Modelos;

public class tipDocumento {
  private String tipDocumento;
  private String descripcion;
  private String abreviatura;
  
  // Constructor //
  public tipDocumento(String tipDocumento, String descripcion, String abreviatura) {
    this.tipDocumento = tipDocumento;
    this.descripcion = descripcion;
    this.abreviatura = abreviatura;
  }
  
  // Getter & Setter //
  public String getTipDocumento() {
    return tipDocumento;
  }
  public void setTipDocumento(String tipDocumento) {
    this.tipDocumento = tipDocumento;
  }

  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getAbreviatura() {
    return abreviatura;
  }
  public void setAbreviatura(String abreviatura) {
    this.abreviatura = abreviatura;
  }

}