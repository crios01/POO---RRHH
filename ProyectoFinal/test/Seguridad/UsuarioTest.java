package Seguridad;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

  public UsuarioTest() {
  }

  @Test
  public void usuarioDebeCrearseConDniNombreyClave() {

    // Arrange
    // Preparar los datos de prueba
    String dni = "74185296";
    String nombre = "nombre 1";
    String clave = "123456";

    // Act
    // Ejecutar el metodo a probar
    Usuario usuario = new Usuario(dni, nombre, clave);

    // Assert
    // Comprobar que el el resultado esperado es igual al retornado
    assertEquals(dni, usuario.getDni());
    assertEquals(nombre, usuario.getNombre());
    assertEquals(clave, usuario.getClave());
    System.out.println("Usuario debe crearse con DNI, Nombre y Clave");
  }
}