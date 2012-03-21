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
  
  public boolean verificaDatos(Cliente nuevoCliente){
    if (!datos(nuevoCliente)){ // Verifica si los campos estan vacios
      return false;
    }
    if (!ClienteExiste(nuevoCliente.getCodCliente(), nuevoCliente.getRuc())){ // Verifica si el Cliente ya existe
      return false;
    }
    if (!verificaTipEmpresa(nuevoCliente.getTipEmpresa())){ // Verifica si existe el Tipo de Empresa
      return false;
    }
    return true;
  }
  
  public boolean ClienteExiste(String codCliente, String ruc){
    simulaClientes();
    for (Cliente cliente : dbClientes){
      if (cliente.getCodCliente().equals(codCliente)){
        JOptionPane.showMessageDialog(null, "Código de Cliente ya existe. Verifique !!!", "Error - Código de Cliente", JOptionPane.ERROR_MESSAGE);
        return false;
      }
    }
    for (Cliente cliente : dbClientes){
      if (cliente.getRuc().equals(ruc)){
        JOptionPane.showMessageDialog(null, "Número de RUC ya existe. Verifique !!!", "Error - RUC", JOptionPane.ERROR_MESSAGE);
        return false;
      }
    }
    return true;
  }
  
  public boolean datos(Cliente cliente){  // Verifica si los campos estan vacios
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
    return true;
  }
  
  // Verificar si estan vacios
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
    if (canEmpleados >= 0){
      return true;
    }
    return false;
  }
  
}