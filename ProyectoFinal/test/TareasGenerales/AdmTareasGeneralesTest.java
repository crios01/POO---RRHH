package TareasGenerales;

import static org.junit.Assert.*;
import java.sql.Timestamp;
import org.junit.Test;

import Seguridad.AdmUsuario;
import Seguridad.Usuario;

public class AdmTareasGeneralesTest {

  public AdmTareasGeneralesTest() {
  }
  AdmTareasGenerales admTarea = new AdmTareasGenerales();

  @Test
  public void admTareasGeneralesDebeRegistrarTarea() {
    System.out.println("Datos Ingresados correctamente obligatorio codigo"
            + " asunto, fechav y responsable");
    // Preparacion
    String codigo = "TG-001";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";
    Tarea tarea = new Tarea(codigo, asunto, fechav, responsable, comentario);
    //Actuacion
    int tareasEsperados = admTarea.getTotalTareas() + 1;
    System.out.println("TareasEsperados: " + tareasEsperados);

    admTarea.adicionarTarea(tarea);
    int tareasRetornados = admTarea.getTotalTareas();
    System.out.println("TareasRetornados: " + tareasRetornados);
    //Comprobacion
    assertEquals(tareasEsperados, tareasRetornados);
    System.out.print("\n");
    System.out.print("\n");

  }

  @Test
  public void admTareasGeneralesBuscarUsuariosSeccionNotificar() {
    System.out.println("Buscar Usuarios Seccion Notificar");
    System.out.print("\n");
    System.out.print("\n");
    //Preparacion
    String dni = "44796945";
    String nombre = "Frank Zelada";
    String clave = "Clave1";
    AdmUsuario admUsuario = new AdmUsuario();
    //Actuacion
    admUsuario.registrarUsuario(dni, nombre, clave);
    Usuario usuario = admUsuario.buscarUsuario(dni);
    //Comprobacion
    assertTrue(usuario.getDni().equals(dni) && usuario.getNombre().equals(nombre)
            && usuario.getClave().equals(clave));


  }

  @Test
  public void admTareasGeneralesEliminarUsuariosSeccionNotificar() {
    System.out.println("Eliminar Usuarios");
    System.out.print("\n");
    System.out.print("\n");
    //Preparacion
    String dni = "44796945";
    String nombre = "Frank Zelada";
    String clave = "Clave1";
    AdmUsuario admUsuario = new AdmUsuario();
    //Actuacion
    admUsuario.registrarUsuario(dni, nombre, clave);
    admUsuario.eliminarUsuario(dni);
    //Comprobacion
    Usuario usuario = admUsuario.buscarUsuario(dni);
    assertNull(usuario);

  }

  @Test
  public void admTareasGeneralesBuscarPorCodigo() {
    System.out.println("Buscar Tarea por codigo");
    System.out.print("\n");
    System.out.print("\n");
    //Preparacion
    String codigo = "TG-001";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";
    Tarea tarea = new Tarea(codigo, asunto, fechav, responsable, comentario);
    //Actuacion
    admTarea.adicionarTarea(tarea);
    Tarea tarea2 = admTarea.buscarTarea(codigo);
    //Comprobacion
    assertTrue(tarea2.getCodigo().equals(codigo) && tarea2.getAsunto().equals(asunto)
            && tarea2.getFechav().equals(fechav) && tarea2.getResponsable().equals(responsable));


  }

  @Test
  public void admTareasGeneralesDebeValidarDuplicidadDeCodigo() {
    System.out.println("No debe Validar Duplicidad de codigo");
    System.out.print("\n");
    System.out.print("\n");
    //Preparacion
    String codigo = "TG-001";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";
    String asunto2 = "Asunto5";
    Timestamp fechav2 = new Timestamp(0);
    String responsable2 = "Pedro";
    String comentario2 = "Comentario5";
    Tarea tarea = new Tarea(codigo, asunto, fechav, responsable, comentario);
    Tarea tarea2 = new Tarea(codigo, asunto2, fechav2, responsable2, comentario2);
    //Actuacion
    boolean registrado1 = admTarea.adicionarTarea(tarea);
    boolean registrado2 = admTarea.adicionarTarea(tarea2);
    //Comprobacion
    assertTrue(registrado1);
    assertFalse(registrado2);

  }

  @Test
  public void admTareasGeneralesDebeEliminarPorCodigo() {
    System.out.println("Debe Eliminar Tarea por Codigo");
    System.out.print("\n");
    System.out.print("\n");
    //Preparacion
    String codigo = "TG-001";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";
    Tarea tarea = new Tarea(codigo, asunto, fechav, responsable, comentario);
    admTarea.adicionarTarea(tarea);
    //Actuacion
    admTarea.eliminarTarea(codigo);
    boolean noExiste = admTarea.noExisteTarea(codigo);
    //Comprobacion                          
    assertTrue(noExiste);
  }

  @Test
  public void admTareasGeneralesNoDebePermitirBlanco() {

    // Preparacion
    String codigo = "";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";
    Tarea tarea = new Tarea(codigo, asunto, fechav, responsable, comentario);

    try {
      admTarea.adicionarTarea(tarea);

    } catch (TareaRegistradoException e) {
      assertEquals(e.getMessage(), "No debe dejar datos en blanco");
      System.out.println(e.getMessage());
    }
    System.out.print("\n");
    System.out.print("\n");

  }
}