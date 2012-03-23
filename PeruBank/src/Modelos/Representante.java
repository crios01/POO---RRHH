package Modelos;

public class Representante {
  private String codCliente;
  private String tipDocumento;
  private String numDocumento;
  private String nombres;
  private String apellidos;
  private String codCargo;
  private String gruBastanteo;

  // Constructor //
  public Representante(String codCliente, String tipDocumento, String numDocumento, String nombres, String apellidos, String codCargo, String gruBastanteo) {
    this.codCliente = codCliente;
    this.tipDocumento = tipDocumento;
    this.numDocumento = numDocumento;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.codCargo = codCargo;
    this.gruBastanteo = gruBastanteo;
  }

  // Getter & Setter //
  public String getCodCliente() {
    return codCliente;
  }
  public void setCodCliente(String codCliente) {
    this.codCliente = codCliente;
  }

  public String getTipDocumento() {
    return tipDocumento;
  }
  public void setTipDocumento(String tipDocu) {
    this.tipDocumento = tipDocumento;
  }
  
  public String getNumDocumento() {
    return numDocumento;
  }
  public void setNumDocumento(String numDocumento) {
    this.numDocumento = numDocumento;
  }

  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getCodCargo() {
    return codCargo;
  }
  public void setCodCargo(String codCargo) {
    this.codCargo = codCargo;
  }

  public String getGruBastanteo() {
    return gruBastanteo;
  }
  public void setGruBastanteo(String gruBastanteo) {
    this.gruBastanteo = gruBastanteo;
  }

}
