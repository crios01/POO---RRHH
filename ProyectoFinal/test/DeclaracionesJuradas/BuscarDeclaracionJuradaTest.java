package DeclaracionesJuradas;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import Modelos.DeclaracionJurada;
import Modelos.Usuario;

public class BuscarDeclaracionJuradaTest {

  public BuscarDeclaracionJuradaTest() {
  }

  @Test
  public void buscarDeclaracionesJuradasByUsuario() {
    Usuario usuario = new Usuario("44819500", "Davis", "44819500");
    AdminDeclaracionJurada adminDeclaracion = new AdminDeclaracionJurada();
    AdminDeclaracionJurada.listarDeclaraciones();
    List<DeclaracionJurada> lista = adminDeclaracion.buscarDeclaracionByUsuario(usuario);
    assertNotNull(lista);
    assertEquals("Administrador", lista.get(0).getCargo());
  }
}