package Modelos;

public class CartaFianza extends Tarea {

  private Proveedor proveedor;
  private String numeroCarta;
  private String numeroContrato;
  private String bancoEmisor;
  private String tipo;
  private String numeroProceso;
  private double importe;

  public Proveedor getProveedor() {
    return proveedor;
  }
  public void setProveedor(Proveedor proveedor) {
    this.proveedor = proveedor;
  }

  public String getNumeroCarta() {
    return numeroCarta;
  }
  public void setNumeroCarta(String numeroCarta) {
    this.numeroCarta = numeroCarta;
  }

  public String getNumeroContrato() {
    return numeroContrato;
  }
  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  public String getBancoEmisor() {
    return bancoEmisor;
  }
  public void setBancoEmisor(String bancoEmisor) {
    this.bancoEmisor = bancoEmisor;
  }

  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNumeroProceso() {
    return numeroProceso;
  }
  public void setNumeroProceso(String numeroProceso) {
    this.numeroProceso = numeroProceso;
  }

  public double getImporte() {
    return importe;
  }
  public void setImporte(double importe) {
    this.importe = importe;
  }

}