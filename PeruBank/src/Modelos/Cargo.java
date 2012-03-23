package Modelos;

public class Cargo {
  private String codCargo;
  private String descripcion;
  private String abreviatura;
  
  // Constructor //
  public Cargo(String codCargo, String descripcion, String abreviatura) {
    this.codCargo = codCargo;
    this.descripcion = descripcion;
    this.abreviatura = abreviatura;
  }

  // Getter & Setter //
  public String getCodCargo() {
    return codCargo;
  }
  public void setCodCargo(String codCargo) {
    this.codCargo = codCargo;
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
