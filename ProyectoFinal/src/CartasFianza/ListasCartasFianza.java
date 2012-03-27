package CartasFianza;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ListasCartasFianza {

  private List<CartaFianza> listaCartaFianza;

  public ListasCartasFianza() {
    //Inicia constructor de listas carta fianza


    listaCartaFianza = new ArrayList<CartaFianza>();

    CartaFianza carta1 = new CartaFianza(1, "CF-001", "CT-001", "BCP", 100, "Proveedor1", "10001", 100.00f, new Timestamp(0), 200, "pedro", "Commint1");
    CartaFianza carta2 = new CartaFianza(2, "CF-002", "CT-002", "SCO", 101, "Proveedor2", "10002", 100.10f, new Timestamp(0), 201, "maria", "Commint2");
    CartaFianza carta3 = new CartaFianza(3, "CF-003", "CT-003", "BCP", 102, "Proveedor3", "10003", 100.20f, new Timestamp(0), 202, "jose", "Commint3");
    CartaFianza carta4 = new CartaFianza(4, "CF-004", "CT-004", "SCO", 103, "Proveedor4", "10004", 100.30f, new Timestamp(0), 203, "carlos", "Commint4");

    listaCartaFianza.add(carta1);
    listaCartaFianza.add(carta2);
    listaCartaFianza.add(carta3);
    listaCartaFianza.add(carta4);

  }

  public List<CartaFianza> getListaCartaFianza() {
    return listaCartaFianza;

  }

  public void setListaCartaFianza(List<CartaFianza> listaCartaFianza) {
    this.listaCartaFianza = listaCartaFianza;
  }
  //Fin constructor de listas carta fianza   

}