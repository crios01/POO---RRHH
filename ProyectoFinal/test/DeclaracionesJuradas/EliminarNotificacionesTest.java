package DeclaracionesJuradas;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import Modelos.DeclaracionJurada;
import Modelos.Usuario;
import Modelos.UsuarioNotificado;

public class EliminarNotificacionesTest {

  public EliminarNotificacionesTest() {
  }

  @Test
  public void eliminarNotificaciones() {
    AdminDeclaracionJurada.listarDeclaraciones();
    List<DeclaracionJurada> lista = AdminDeclaracionJurada.resultDeclaraciones();
    Usuario usuario1 = new Usuario("44819500", "Davis1", "44819501");
    Usuario usuario2 = new Usuario("44819s500", "Davis2", "44819502");
    Usuario usuario3 = new Usuario("44819500", "Davis3", "44819503");
    UsuarioNotificado notificacion1 = new UsuarioNotificado(lista.get(0), usuario1);
    UsuarioNotificado notificacion2 = new UsuarioNotificado(lista.get(0), usuario2);
    UsuarioNotificado notificacion3 = new UsuarioNotificado(lista.get(0), usuario3);

    List<UsuarioNotificado> listNotificaciones = new ArrayList<UsuarioNotificado>();
    listNotificaciones.add(notificacion1);
    listNotificaciones.add(notificacion2);
    listNotificaciones.add(notificacion3);

    assertNotNull(notificacion1);
    assertEquals(3, listNotificaciones.size());
    System.out.println(listNotificaciones.get(0).getUsuario().getDni());
    assertEquals("44819500", listNotificaciones.get(0).getUsuario().getDni());
  }
}
