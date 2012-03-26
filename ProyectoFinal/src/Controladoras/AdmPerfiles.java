package Controladoras;

import Modelos.Perfil;
import java.util.ArrayList;

public class AdmPerfiles {
  ArrayList<Perfil> dbPerfiles = new ArrayList<Perfil>();
  
  private void simularPerfiles(){
    this.dbPerfiles.add(new Perfil("1", "Administrador"));
    this.dbPerfiles.add(new Perfil("2", "Responsable"));
    this.dbPerfiles.add(new Perfil("3", "Involucrado"));
    this.dbPerfiles.add(new Perfil("4", "Empleado de Servir"));
    this.dbPerfiles.add(new Perfil("5", "Logística"));
    this.dbPerfiles.add(new Perfil("6", "RRHH"));
  }
  
  // Validar si Perfil existe //
  public Perfil existePerfil(String codPerfil){
    simularPerfiles();
    Perfil perfilEncontrado = null;
    for (Perfil perfil : dbPerfiles) {
      if (perfil.getCodPerfil().equals(codPerfil)){
        perfilEncontrado = perfil;
      }
    }
    return perfilEncontrado;
  }
  // Verificar campos vacios //
  public boolean verificaCampo(String campo){
    if (campo != null){
      return true;
    }
    return false;
  }
}
