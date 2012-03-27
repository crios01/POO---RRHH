package DeclaracionesJuradas;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import Modelos.DeclaracionJurada;
//import Modelos.Usuario;

public class EliminarDeclaracionJuradaTest {

  public EliminarDeclaracionJuradaTest() {
  }

  @Test
  public void eliminarDeclaracionJurada() {
    //Usuario usuario = new Usuario("44819500", "Davis", "123456");
    AdminDeclaracionJurada.listarDeclaraciones();
    List<DeclaracionJurada> lista = AdminDeclaracionJurada.resultDeclaraciones();
    assertNotNull(lista);
    System.out.println(lista.size());

    assertEquals(true, lista.get(0).eliminar());
    System.out.println(lista.size());
    assertEquals(3, lista.size());
  }
}