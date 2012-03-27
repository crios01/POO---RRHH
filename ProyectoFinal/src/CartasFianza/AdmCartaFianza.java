package CartasFianza;

import java.util.ArrayList;
import java.util.List;

public class AdmCartaFianza {

  // Atributo
  List<CartaFianza> listaCartaFianza;

  // Constructor no devuelve nada y tampoco se le pone "void"
  public AdmCartaFianza(List<CartaFianza> listaCartaFianza) {
    this.listaCartaFianza = listaCartaFianza;

  }

//      public void registraCartaFianza(CartaFianza cartafianza,
  //              List<Usuario> listaNotificacion) {
  //}
  //Buscador para dos parametros
  public List<CartaFianza> buscarCartaFianza(String codCartaFianza, String strProveedor) {
    List<CartaFianza> listaResultado = new ArrayList<CartaFianza>();

    for (CartaFianza bean : listaCartaFianza) {
      if (bean.getCodCartaFianza().equals(codCartaFianza)) {
        if (strProveedor == null || strProveedor.equals("")) {
          listaResultado.add(bean);

        }
        if (bean.getStrProveedor().equals(strProveedor)) {
          listaResultado.add(bean);
        }
      }

      if (bean.getStrProveedor().equals(strProveedor)) {
        if (codCartaFianza == null || codCartaFianza.equals("")) {
          listaResultado.add(bean);
        }
        if (bean.getCodCartaFianza().equals(codCartaFianza)) {
          listaResultado.add(bean);

        }
      }

    }
    return listaResultado;
  }
}