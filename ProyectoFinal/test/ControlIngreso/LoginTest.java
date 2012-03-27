package ControlIngreso;

import Modelos.Usuario;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

  public LoginTest() {
  }

  @Test
  public void testCorectoIsUsuarioValido() {

    String Usuario = "Usuario1";
    String Clave = "123456";
    List<Usuario> listaUsuario = new Listas().getListaUsuario();
    Login login = new Login(listaUsuario);

    boolean expResult = true;
    boolean result = login.isUsuarioValido(Usuario, Clave);
    assertEquals(expResult, result);

    System.out.println("1. Usuario y contraseña son correctas, bienvenido al Sistema.");
  }

  @Test
  public void testIncorectoIsUsuarioValido() {

    String Usuario = "Usuario1";
    String Clave = "123458.";
    List<Usuario> listaUsuario = new Listas().getListaUsuario();
    Login login = new Login(listaUsuario);

    boolean expResult = false;
    boolean result = login.isUsuarioValido(Usuario, Clave);
    assertEquals(expResult, result);

    System.out.println("2. Usuario o contraseña es incorrecto.");
  }

  @Test
  public void testVacioIsUsuario() {

    String Usuario = "";
    String Clave = "";
    List<Usuario> listaUsuario = new Listas().getListaUsuario();
    Login login = new Login(listaUsuario);

    boolean expResult = false;
    boolean result = login.isUsuarioValido(Usuario, Clave);
    assertEquals(expResult, result);

    System.out.println("3. Debe ingresar usuario y contraseña.");
  }
}