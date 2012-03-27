package NotificacionesRecord;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import Modelos.Empleado;
import Modelos.TareaGeneral;

public class AdmNotificacionTest {

  private ArrayList<TareaGeneral> alsTareaGeneral;

  public AdmNotificacionTest() {
    this.alsTareaGeneral = new ArrayList<TareaGeneral>();

    Date fechaVencimiento = new Date();

    //fechaVencimiento.setDate(1);                          

    Empleado objEmpleado = new Empleado(1, "César Vallejo");

    TareaGeneral objTareaGeneral = new TareaGeneral(1, "Asunto 1", fechaVencimiento, objEmpleado, "Comentario 1", "En desarrollo");
    this.alsTareaGeneral.add(objTareaGeneral);

    assertEquals(1, objTareaGeneral.getTarea_id());
    assertEquals("Asunto 1", objTareaGeneral.getAsunto());
    assertEquals(fechaVencimiento, objTareaGeneral.getFechaVencimiento());
    assertEquals("César Vallejo", objTareaGeneral.getResponsable());
    assertEquals("Comentario 1", objTareaGeneral.getComentario());
    assertEquals("En desarrollo", objTareaGeneral.getEstado());
  }

  @Test
  public void consultarTareasxVencer() {
    System.out.println("----- Consultando las tareas por vencer -----");

    AdmNotificacion objAdmNotificacion = new AdmNotificacion();

    Date fechaActual = new Date();
    int intDias = 6;

    assertNotNull(fechaActual);
    assertNotNull(intDias);

    objAdmNotificacion.consultarTareasxVencer(this.alsTareaGeneral, fechaActual, intDias);
  }

}