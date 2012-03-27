package TareasGenerales;

import static org.junit.Assert.*;
import java.sql.Timestamp;
import org.junit.Test;

public class TareaTest {

  public TareaTest() {
  }

  @Test
  public void tareaDebeCrearseConDatosCompletos() {
    System.out.println("Tarea debe registrarse con "
            + "codigo, asunto, fechav, responsabe y comentario");

    //Preparar los datos de prueba
    String codigo = "TG-001";
    String asunto = "Asunto1";
    Timestamp fechav = new Timestamp(0);
    String responsable = "Frank";
    String comentario = "Comentario1";

    //Ejecucion de la prueba
    Tarea objTarea = new Tarea(codigo, asunto, fechav, responsable, comentario);

    //Comprobar que el resultado esperado es igual al retorando
    assertTrue(codigo.equals(objTarea.getCodigo()) && asunto.equals(objTarea.getAsunto())
            && fechav.equals(objTarea.getFechav()) && responsable.equals(objTarea.getResponsable())
            && comentario.equals(objTarea.getComentario()));

  }
}