package DeclaracionesJuradas;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import Modelos.DeclaracionJurada;
import Modelos.Empleado;
import Modelos.Usuario;

public class AdicionarDeclaracionJuradaTest {

  public AdicionarDeclaracionJuradaTest() {
  }

  @Test
  public void adicionarDeclaracionJurada() {
    Usuario usuario = new Usuario("44819500", "Davis", "123456");
    DeclaracionJurada declaracion1 = new DeclaracionJurada("Administrador", new Date(), "Inicio", new Date(), new Date(), new Date(), "1234567");
    declaracion1.setUsuario(usuario);
    Empleado empleado = new Empleado(1, "Davis");
    declaracion1.setEmpleadoResponsable(empleado);
    declaracion1.setFechaVencimiento(new Date());
    assertNotNull(declaracion1);
    assertEquals(true, declaracion1.adicionar());
  }
}