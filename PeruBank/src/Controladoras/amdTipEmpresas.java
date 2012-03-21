package Controladoras;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelos.tipEmpresa;

public class amdTipEmpresas {
  private ArrayList<tipEmpresa> dbtipEmpresas = new ArrayList<>();

  private boolean verificaTipEmpresa(String tipEmpresa){
    simulaTipEmpresas();
    for (tipEmpresa TipEmpresa : dbtipEmpresas){
      if (TipEmpresa.getTipEmpresa().equals(tipEmpresa)){
        return true;
      }
    }
    JOptionPane.showMessageDialog(null, "Tipo de empresa no existe. Verifique !!!", "Error - Tipo de Empresa", JOptionPane.ERROR_MESSAGE);
    return false;
  }
  
  private void simulaTipEmpresas() {
    this.dbtipEmpresas.add(new tipEmpresa("001", "Sociedad Anónima Abierta", "SAA"));
    this.dbtipEmpresas.add(new tipEmpresa("002", "Sociedad Anónima Cerrada", "SAC"));
    this.dbtipEmpresas.add(new tipEmpresa("003", "Sociedad de Responsabilidad Limitada", "SRL"));
    this.dbtipEmpresas.add(new tipEmpresa("004", "Empresa Individual de Responsabilidad Limitada", "EIRL"));
    this.dbtipEmpresas.add(new tipEmpresa("005", "Sociedad Anónima Ordinaria o Común", "SA"));
    //this.dbtipEmpresas.add(new tipEmpresa("006", "", ""));
  }
  
}
