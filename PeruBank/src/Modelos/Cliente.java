package Modelos;

public class Cliente {
  private String codCliente;
  private String razonSocial;
  private String ruc;
  private String fechaInicio;
  private String tipEmpresa;
  private int canEmpleados;
  // Constructor
  public Cliente(String codCliente, String razonSocial, String ruc, String fechaInicio, String tipEmpresa, int canEmpleados) {
    this.codCliente = codCliente;
    this.razonSocial = razonSocial;
    this.ruc = ruc;
    this.fechaInicio = fechaInicio;
    this.tipEmpresa = tipEmpresa;
    this.canEmpleados = canEmpleados;
  }
  // Getter & Setter
  public String getCodCliente() {
    return codCliente;
  }
  public void setCodCliente(String codCliente) {
    this.codCliente = codCliente;
  }

  public String getRazonSocial() {
    return razonSocial;
  }
  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public String getRuc() {
    return ruc;
  }
  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public String getFechaInicio() {
    return fechaInicio;
  }
  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public String getTipEmpresa() {
    return tipEmpresa;
  }
  public void setTipEmpresa(String tipEmpresa) {
    this.tipEmpresa = tipEmpresa;
  }
  
  public int getCanEmpleados() {
    return canEmpleados;
  }
  public void setCanEmpleados(int canEmpleados) {
    this.canEmpleados = canEmpleados;
  }

}
