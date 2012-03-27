package DeclaracionesJuradas;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import Modelos.DeclaracionJurada;
import Modelos.Empleado;
import Modelos.Usuario;

public class ModificarDeclaracionJuradaTest {

  public ModificarDeclaracionJuradaTest() {
  }

  @Test
  public void modificarDeclaracionJurada() {
    AdminDeclaracionJurada.listarDeclaraciones();
    Usuario usuario = new Usuario("44819500", "Davis", "123456");
    List<DeclaracionJurada> list = AdminDeclaracionJurada.buscarDeclaracionByUsuario(usuario);

    assertNotNull(list);

    list.get(0).setCargo("Modificacion1");
    Empleado empleado = new Empleado(12, "Davis");
    list.get(0).setEmpleadoResponsable(empleado);
    list.get(0).setFechaVencimiento(new Date());
    list.get(0).setComentario("comentario modificado");
    assertEquals(true, list.get(0).editar());
  }
}
