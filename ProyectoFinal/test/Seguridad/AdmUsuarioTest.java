package Seguridad;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdmUsuarioTest {

  public AdmUsuarioTest() {
  }

  @Test
  public void admUsuariosDebeRegistrarUsuario() {
    System.out.println("Administrador de usuarios debe registrar un usuario con DNI, nombre y clave");
    // Arrange
    String dni = "74185296";
    String nombre = "nombre 1";
    String clave = "123456";
    AdmUsuario adm = new AdmUsuario();
    // Act
    adm.registrarUsuario(dni, nombre, clave);
    //Assert
    Usuario usuario = adm.buscarUsuario(dni);
    assertNotNull(usuario);
    assertEquals(dni, usuario.getDni());
    assertEquals(nombre, usuario.getNombre());
    assertEquals(clave, usuario.getClave());
  }

  @Test
  public void admUsuariosDebeValidarDuplicidadDeDni() {
    System.out.println("Administrador de usuarios debe validar duplicidad de DNI de usuario");
    // Arrange
    String dni = "74185296";
    String nombre = "nombre 1";
    String clave = "123456";
    AdmUsuario adm = new AdmUsuario();

    // Act
    adm.registrarUsuario(dni, nombre, clave);

    //Assert
    int totalUsuariosRetornado = adm.getTotalUsuarios();
    int totalUsuarioEsperado = 1;
    assertEquals(totalUsuarioEsperado, totalUsuariosRetornado);
  }

  @Test
  public void admUsuariosDebeEliminarUsuarioPorDni() {

    System.out.println("Administrador de usuarios debe eliminar un usuario considerando el DNI");
    // Arrange
    String dni = "74185296";
    String nombre = "nombre 1";
    String clave = "123456";
    AdmUsuario adm = new AdmUsuario();
    adm.registrarUsuario(dni, nombre, clave);
    // Act
    adm.eliminarUsuario(dni);

    //Assert
    Usuario usuario = adm.buscarUsuario(dni);
    assertNull(usuario);
  }
}