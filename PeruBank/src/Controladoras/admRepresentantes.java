package Controladoras;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelos.Representante;

public class admRepresentantes {
  
  private ArrayList<Representante> dbRepresentantes = new ArrayList<>();
  admClientes AdmClientes = new admClientes();
  
  private void simulaRepresentantes(){
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", "", ""));
  }
  
  // Verificación general de datos //
  
  // Verifica la consistencia de datos //
  public boolean consistenciaDatos(Representante representante){
    if (!AdmClientes.verificaCodCliente(representante.getCodCliente())){
      JOptionPane.showMessageDialog(null, "Ingrese el Código de Cliente", "Error - Código de Cliente", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaTipDocumento(representante.getTipDocumento())){
      JOptionPane.showMessageDialog(null, "Ingrese el Tipo de Documento", "Error - Tipo de Documento", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    if (!verificaNumDocumento(representante.getNumDocumento())){
      JOptionPane.showMessageDialog(null, "Ingrese el Número de Documento", "Error - Número de Documento", JOptionPane.ERROR_MESSAGE);
      return false;
    }
    return true;
  }
  // Verificaciones unitarias //
  // ======================== //
  // Verifica si campo existe //
  public boolean verificaExisteRepresentante(String tipDocumento, String numDocumento){
    simulaRepresentantes();
    for (Representante representante : dbRepresentantes){
      if (representante.getTipDocumento().equals(tipDocumento) && representante.getNombres().equals(numDocumento)){
        return true;
      }
    }
    return false;
  }
  // Verificación unitaria para saber si estan vacios los campos //
  public boolean verificaTipDocumento(String tipDocumento){
    if (tipDocumento != null){
      return true;
    }
    return false;
  }
  public boolean verificaNumDocumento(String numDocumento){
    if (numDocumento != null){
      return true;
    }
    return false;
  }
  public boolean verificaNombres(String nombres){
    if (nombres != null){
      return true;
    }
    return false;
  }
  public boolean verificaApellidos(String apellidos){
    if (apellidos != null){
      return true;
    }
    return false;
  }
  public boolean verificaCodCargo(String codCargo){
    if (codCargo != null){
      return true;
    }
    return false;
  }
  public boolean verificaGruBastanteo(String gruBastanteo){
    if (gruBastanteo != null){
      return true;
    }
    return false;
  }
  // 
}