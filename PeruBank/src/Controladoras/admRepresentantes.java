package Controladoras;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Modelos.Representante;

public class admRepresentantes {
  
  private ArrayList<Representante> dbRepresentantes = new ArrayList<>();
  
  private void simulaRepresentantes(){
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
    this.dbRepresentantes.add(new Representante("", "", "", "", "", ""));
  }

}