package Controladoras;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelos.Cliente;

public class admClientes {
  
  private ArrayList<Cliente> dbClientes = new ArrayList<>();
  
  private void simulaClientes() {
    this.dbClientes.add(new Cliente("001", "Detroit Diesel MTU Perú",         "20100020441", "05/01/2003", "002", 150));
    this.dbClientes.add(new Cliente("002", "Aceros Boehler del Perú",         "20100036101", "03/02/2004", "005", 250));
    this.dbClientes.add(new Cliente("003", "Suthern Peru Cooper Corporation", "20100147514", "10/08/2004", "001", 4500));
    this.dbClientes.add(new Cliente("004", "Xstrata Tintaya",                 "20114915026", "05/02/2005", "005", 3580));
    this.dbClientes.add(new Cliente("005", "SinoMaq",                         "20517519490", "27/03/2005", "005", 250));
    this.dbClientes.add(new Cliente("006", "Comercial del Acero",             "20527600031", "13/04/2005", "002", 475));
    this.dbClientes.add(new Cliente("007", "Constructora Cairo",              "20493066791", "15/04/2005", "002", 150));
    this.dbClientes.add(new Cliente("008", "Telefónica del Perú",             "20100017491", "23/05/2005", "001", 150));
  }
  // Verificación general de los Datos
  public boolean verificaDatos(Cliente nuevoCliente){
    if (!consistenciaDatos(nuevoCliente)){ // Verifica si los campos estan vacios
      return false;
    }
    if (!verificaExisteCodCliente(nuevoCliente.getCodCliente())){ // Verifica si el Código del Cliente ya existe
      JOptionPane.showMessageDialog(null, "Código de Cliente ya existe. Verifique !!!", "Error - Código de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaExisteRuc(nuevoCliente.getRuc())){ // Verifica si el RUC del Cliente ya existe
      JOptionPane.showMessageDialog(null, "Número de RUC ya existe. Verifique !!!", "Error - RUC", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaTipEmpresa(nuevoCliente.getTipEmpresa())){ // Verifica si existe el Tipo de Empresa
      JOptionPane.showMessageDialog(null, "Tipo de empresa no existe. Verifique !!!", "Error - Tipo de Empresa", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    return true;
  }
  // Verifica la consistencia de Datos
  public boolean consistenciaDatos(Cliente cliente){
    if (!verificaCodCliente(cliente.getCodCliente())){
      JOptionPane.showMessageDialog(null, "Ingrese Código de Cliente", "Error - Código de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaRazonSocial(cliente.getRazonSocial())){
      JOptionPane.showMessageDialog(null, "Ingrese Razón Social", "Error - Razón Social", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaRuc(cliente.getRuc())){
      JOptionPane.showMessageDialog(null, "Ingrese RUC", "Error - RUC", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaFechaInicio(cliente.getFechaInicio())){
      JOptionPane.showMessageDialog(null, "Ingrese Fecha de Inicio de Operaciones", "Error - Fecha Inicio", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaTipEmpresa(cliente.getTipEmpresa())){
      JOptionPane.showMessageDialog(null, "Ingrese el Tipo de Empresa", "Error - Tipo de Empresa", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaCanEmpleados(cliente.getCanEmpleados())){
      JOptionPane.showMessageDialog(null, "Ingrese la Cantidad de Empleados", "Error - Cantidad de Empleados", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaCanDigitosCodCliente(cliente.getCodCliente())){
      JOptionPane.showMessageDialog(null, "El Código de Cliente debe tener 8 dígitos", "Error - Código de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaCanDigitosRucCliente(cliente.getRuc())){
      JOptionPane.showMessageDialog(null, "El RUC de Cliente debe tener 11 dígitos", "Error - RUC de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaDigitosRuc(cliente.getRuc())){
      JOptionPane.showMessageDialog(null, "El RUC de Cliente solo debe contener dígitos", "Error - RUC de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaDigitoInicialRuc(cliente.getRuc())){
      JOptionPane.showMessageDialog(null, "El RUC de Cliente debe comenzar con 1 ó 2", "Error - RUC de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    return true;
  }
  // Verificaciones Unitarias //
  // ======================== //
  // Verifica si Campo existe
  public boolean verificaExisteCodCliente(String codCliente){
    simulaClientes();
    for (Cliente cliente : dbClientes){
      if (cliente.getCodCliente().equals(codCliente)){
        return true;
      }
    }
    return false;
  }
  public boolean verificaExisteRuc(String ruc){
    simulaClientes();
    for (Cliente cliente : dbClientes){
      if (cliente.getRuc().equals(ruc)){
        return true;
      }
    }
    return false;
  }
  // Verificar unitaria para saber si estan vacios los campos
  public boolean verificaCodCliente(String codCliente){
    if (codCliente != null) {
      return true;
    }
    return false;
  }
  public boolean verificaRazonSocial(String razonSocial){
    if (razonSocial != null){
      return true;
    }
    return false;
  }
  public boolean verificaRuc(String ruc){
    if (ruc != null){
      return true;
    }
    return false;
  }
  public boolean verificaFechaInicio(String fechaInicio){
    if (fechaInicio != null){
      return true;
    }
    return false;
  }
  public boolean verificaTipEmpresa(String tipEmpresa){
    if (tipEmpresa != null){
      return true;
    }
    return false;
  }
  public boolean verificaCanEmpleados(int canEmpleados){
    if (canEmpleados > 0){
      return true;
    }
    return false;
  }
  //Verificar cantidad de dígitos en el código y el ruc del cliente
  public boolean verificaCanDigitosCodCliente(String codCliente){
    if (codCliente.trim().length() != 8){
      return false;
    }
    return true;
  }
  public boolean verificaCanDigitosRucCliente(String ruc){
    if(ruc.trim().length() != 11){
      return false;
    }
    return true;
  }
  public boolean verificaDigitosRuc(String ruc){
    String numeros = "0123456789";
    for (int i = 0; i < ruc.length(); i++){
      if(numeros.indexOf(ruc.charAt(i),0) == -1){
       return false;
      }
    }
    return true;
  }
  public boolean verificaDigitoInicialRuc(String ruc){
    if(!ruc.substring(0, 1).equals("1") && !ruc.substring(0, 1).equals("2")){
      return false;
    }
    return true;
  }
}