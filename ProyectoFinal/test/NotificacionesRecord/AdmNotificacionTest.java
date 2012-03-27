package NotificacionesRecord;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import Modelos.Empleado;
import Modelos.TareaGeneral;
import Modelos.TipoTarea;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AdmNotificacionTest {

  public AdmNotificacionTest() {
  }
  private ArrayList<TareaGeneral> alsTareaGeneral;

  @Test
  public void consultarTareasxVencer() {
    this.alsTareaGeneral = new ArrayList<TareaGeneral>();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    String date = "2012/02/28";
    Date fechaVencimiento = null;

    try {
      fechaVencimiento = formatter.parse(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }

    System.out.println("Fecha vencimiento: " + fechaVencimiento);

    // fechaVencimiento.setDate(1);

    Empleado objEmpleado = new Empleado(1, "César Vallejo");
    Empleado objEmpleadoResponsable = new Empleado(2, "Juan Perez");

    TareaGeneral objTareaGeneral = new TareaGeneral(1, "Asunto 1", fechaVencimiento, objEmpleadoResponsable, "Comentario 1", "En desarrollo", objEmpleado);
    this.alsTareaGeneral.add(objTareaGeneral);

    assertEquals(1, objTareaGeneral.getTarea_id());
    assertEquals("Asunto 1", objTareaGeneral.getAsunto());
    assertEquals(fechaVencimiento, objTareaGeneral.getFechaVencimiento());
    assertEquals("Juan Perez", objTareaGeneral.getEmpleadoResponsable().getNombre());
    assertEquals("Comentario 1", objTareaGeneral.getComentario());
    assertEquals("En desarrollo", objTareaGeneral.getEstado());
    assertEquals("César Vallejo", objEmpleado.getNombre());

    System.out.println("Empleado responsable: " + objTareaGeneral.getEmpleadoResponsable().getNombre());
    System.out.println("----- Consultando las tareas por vencer -----");

    AdmNotificacion objAdmNotificacion = new AdmNotificacion();

    String dateNow = "2012/02/18";
    Date fechaActual = null;

    try {
      fechaActual = formatter.parse(dateNow);
    } catch (ParseException e) {
      e.printStackTrace();
    }

    int intDiasConf = 10;

    assertNotNull(fechaActual);
    assertNotNull(intDiasConf);

    TipoTarea objTipoTarea = new TipoTarea();
    objTipoTarea.setNotificacion(true);
    objTipoTarea.setRecordatorio(true);

    assertTrue(objTipoTarea.isNotificacion());
    assertTrue(objTipoTarea.isRecordatorio());
    assertEquals(true, objAdmNotificacion.consultarTareasxVencer(this.alsTareaGeneral, fechaActual, intDiasConf, objTipoTarea));
  }
}