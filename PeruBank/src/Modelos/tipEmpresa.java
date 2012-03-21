package Modelos;

public class tipEmpresa {
  private String TipEmpresa; // Código
  private String descripcion;
  private String abraviatura;

  //Constructor
  public tipEmpresa(String TipEmpresa, String descripcion, String abraviatura) {
    this.TipEmpresa = TipEmpresa;
    this.descripcion = descripcion;
    this.abraviatura = abraviatura;
  }
  // Getter & Setter
  public String getTipEmpresa() {
    return TipEmpresa;
  }
  public void setTipEmpresa(String tipEmpresa) {
    this.TipEmpresa = tipEmpresa;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getAbraviatura() {
    return abraviatura;
  }
  public void setAbraviatura(String abraviatura) {
    this.abraviatura = abraviatura;
  }
}