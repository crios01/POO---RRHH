package DeclaracionesJuradas;

import Modelos.DeclaracionJurada;
import Modelos.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminDeclaracionJurada {

  static List<DeclaracionJurada> listaDeclaraciones = new ArrayList<DeclaracionJurada>();

  public static void listarDeclaraciones() {
    Usuario usuario = new Usuario("44819500", "Davis", "123456");
    DeclaracionJurada declaracion1 = new DeclaracionJurada("Administrador", new Date(), "Inicio", new Date(), new Date(), new Date(), "1234567");
    declaracion1.setUsuario(usuario);
    DeclaracionJurada declaracion2 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion2.setUsuario(usuario);
    DeclaracionJurada declaracion3 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion3.setUsuario(usuario);
    DeclaracionJurada declaracion4 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion4.setUsuario(usuario);

    listaDeclaraciones.add(declaracion1);
    listaDeclaraciones.add(declaracion2);
    listaDeclaraciones.add(declaracion3);
    listaDeclaraciones.add(declaracion4);
  }

  public static List<DeclaracionJurada> buscarDeclaracionByUsuario(Usuario usuarioCreador) {
    List<DeclaracionJurada> resultList = new ArrayList<DeclaracionJurada>();
    for (DeclaracionJurada declaracion : listaDeclaraciones) {
      if (declaracion.getUsuario().getDni().equals(usuarioCreador.getDni())) {
        resultList.add(declaracion);
      }
    }
    return resultList;
  }

}