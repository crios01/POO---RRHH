package DeclaracionesJuradas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Modelos.DeclaracionJurada;
import Modelos.Usuario;

public class AdminDeclaracionJurada {

  static List<DeclaracionJurada> listaDeclaraciones = new ArrayList<DeclaracionJurada>();

  public static List<DeclaracionJurada> resultDeclaraciones() {
    return listaDeclaraciones;
  }

  public static void listarDeclaraciones() {
    Usuario usuario = new Usuario("44819500", "Davis", "123456");
    DeclaracionJurada declaracion1 = new DeclaracionJurada("Administrador", new Date(), "Inicio", new Date(), new Date(), new Date(), "1234567");
    declaracion1.setTarea_id(1);
    declaracion1.setUsuario(usuario);
    DeclaracionJurada declaracion2 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion2.setUsuario(usuario);
    declaracion2.setTarea_id(2);
    DeclaracionJurada declaracion3 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion3.setUsuario(usuario);
    declaracion3.setTarea_id(3);
    DeclaracionJurada declaracion4 = new DeclaracionJurada("Administrador", new Date(), "Jurada", new Date(), new Date(), new Date(), "1234567");
    declaracion4.setUsuario(usuario);
    declaracion4.setTarea_id(4);

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