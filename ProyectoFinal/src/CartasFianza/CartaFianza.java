package CartasFianza;

import java.sql.Timestamp;

public class CartaFianza {

  // Lista de atributos //
  int idCartaFianza;
  String codCartaFianza;
  String codContrato;
  String strBancoEmisor;
  int intTipoFianza;
  String strProveedor;
  String codProcesoDeSeleccion;
  float flImporte;
  Timestamp tmzFechaDeVencimiento;
  int intIdResponsable;
  String strResponsable;
  String strComentario;

  public CartaFianza(int idCartaFianza, String codCartaFianza, String codContrato, String strBancoEmisor, int intTipoFianza, String strProveedor, String codProcesoDeSeleccion, float flImporte, Timestamp tmzFechaDeVencimiento, int intIdResponsable, String strResponsable, String strComentario) {

    this.idCartaFianza = idCartaFianza;
    this.codCartaFianza = codCartaFianza;
    this.codContrato = codContrato;
    this.strBancoEmisor = strBancoEmisor;
    this.intTipoFianza = intTipoFianza;
    this.strProveedor = strProveedor;
    this.codProcesoDeSeleccion = codProcesoDeSeleccion;
    this.flImporte = flImporte;
    this.tmzFechaDeVencimiento = tmzFechaDeVencimiento;
    this.intIdResponsable = intIdResponsable;
    this.strResponsable = strResponsable;
    this.strComentario = strComentario;
  }

  public int getIdCartaFianza() {
    return idCartaFianza;
  }

  public void setIdCartaFianza(int idCartaFianza) {
    this.idCartaFianza = idCartaFianza;
  }

  public String getCodCartaFianza() {
    return codCartaFianza;
  }

  public void setCodCartaFianza(String codCartaFianza) {
    this.codCartaFianza = codCartaFianza;
  }

  public String getCodContrato() {
    return codContrato;
  }

  public void setCodContrato(String codContrato) {
    this.codContrato = codContrato;
  }

  public String getStrBancoEmisor() {
    return strBancoEmisor;
  }

  public void setStrBancoEmisor(String strBancoEmisor) {
    this.strBancoEmisor = strBancoEmisor;
  }

  public int getIntTipoFianza() {
    return intTipoFianza;
  }

  public void setIntTipoFianza(int intTipoFianza) {
    this.intTipoFianza = intTipoFianza;
  }

  public String getStrProveedor() {
    return strProveedor;
  }

  public void setStrProveedor(String strProveedor) {
    this.strProveedor = strProveedor;
  }

  public String getCodProcesoDeSeleccion() {
    return codProcesoDeSeleccion;
  }

  public void setCodProcesoDeSeleccion(String codProcesoDeSeleccion) {
    this.codProcesoDeSeleccion = codProcesoDeSeleccion;
  }

  public float getFlImporte() {
    return flImporte;
  }

  public void setFlImporte(float flImporte) {
    this.flImporte = flImporte;
  }

  public Timestamp getTmzFechaDeVencimiento() {
    return tmzFechaDeVencimiento;
  }

  public void setTmzFechaDeVencimiento(Timestamp tmzFechaDeVencimiento) {
    this.tmzFechaDeVencimiento = tmzFechaDeVencimiento;
  }

  public int getIntIdResponsable() {
    return intIdResponsable;
  }

  public void setIntIdResponsable(int intIdResponsable) {
    this.intIdResponsable = intIdResponsable;
  }

  public String getStrResponsable() {
    return strResponsable;
  }

  public void setStrResponsable(String strResponsable) {
    this.strResponsable = strResponsable;
  }

  public String getStrComentario() {
    return strComentario;
  }

  public void setStrComentario(String strComentario) {
    this.strComentario = strComentario;
  }
}