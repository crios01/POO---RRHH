package NotificacionesRecord;

import Modelos.TareaGeneral;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdmNotificacion {

  private ArrayList<TareaGeneral> alsTareaGeneral;

  public AdmNotificacion() {
    this.alsTareaGeneral = new ArrayList<TareaGeneral>();
  }

  public boolean consultarTareasxVencer(ArrayList<TareaGeneral> alsTareaGeneral, Date fecha, int intDias) {

    try {
      for (TareaGeneral objTareaGeneral : alsTareaGeneral) {
        if (objTareaGeneral.getFechaVencimiento().compareTo(fecha) >= 0
                && objTareaGeneral.getFechaVencimiento().compareTo(fecha) <= intDias) {
          this.alsTareaGeneral.add(objTareaGeneral);
        }
      }

      this.enviarNotificacion();

      return true;

    } catch (Exception e) {
      return false;
    }
  }

  public void enviarNotificacion() {

    for (TareaGeneral objTareaGeneral : this.alsTareaGeneral) {
      System.out.println("----------------------------------------");
      System.out.println("------------- Notificacion -------------");
      System.out.println(objTareaGeneral.getAsunto());

      DateFormat formateadorFecha = DateFormat.getDateInstance(java.text.DateFormat.FULL);
      System.out.println("Vencimiento: " + formateadorFecha.format(objTareaGeneral.getFechaVencimiento()));

      System.out.println("Responsable: " + objTareaGeneral.getEmpleadoResponsable());
      System.out.println("Comentario: " + objTareaGeneral.getComentario());
      System.out.println("Estado: " + objTareaGeneral.getEstado());
      System.out.println("----------------------------------------");
      System.out.println();

      this.enviarRecordatorio(objTareaGeneral);
    }
  }

  public void enviarRecordatorio(TareaGeneral objTareaGeneral) {
    System.out.println("----------------------------------------");
    System.out.println("------------- Recordatorio -------------");
    System.out.println(objTareaGeneral.getAsunto());

    DateFormat formateadorFecha = DateFormat.getDateInstance(java.text.DateFormat.FULL);
    System.out.println("Vencimiento: " + formateadorFecha.format(objTareaGeneral.getFechaVencimiento()));

    System.out.println("Responsable: " + objTareaGeneral.getEmpleadoResponsable());
    System.out.println("----------------------------------------");
    System.out.println();
  }

}