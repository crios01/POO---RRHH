package NotificacionesRecord;

import Modelos.TareaGeneral;
import Modelos.TipoTarea;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdmNotificacion {

  private ArrayList<TareaGeneral> alsTareaGeneralxVencer;

  public AdmNotificacion() {
    this.alsTareaGeneralxVencer = new ArrayList<TareaGeneral>();
  }

  public boolean consultarTareasxVencer(ArrayList<TareaGeneral> alsTareaGeneral, Date fecha, int intDiasConf, TipoTarea objTipoTarea) {

    try {
      System.out.println("consultando tareas x vencer");
      boolean enviar = false;

      for (TareaGeneral objTareaGeneral : alsTareaGeneral) {

        //if (objTareaGeneral.getFechaVencimiento().compareTo(fecha) >= 0 && 
        //              objTareaGeneral.getFechaVencimiento().compareTo(fecha) <= intDias)

        System.out.println("Fecha vencim: " + objTareaGeneral.getFechaVencimiento());
        System.out.println("Fecha actual: " + fecha);

        long dif = objTareaGeneral.getFechaVencimiento().getTime() - fecha.getTime();
        System.out.println("Dias entre fechas: " + dif / 86400000L); // 3600 * 24 * 1000
        long dias = dif / 86400000L;

        if (dias <= intDiasConf) {
          this.alsTareaGeneralxVencer.add(objTareaGeneral);
          enviar = true;
        }
      }

      if (enviar == true) {
        this.enviarNotificacion(objTipoTarea);
      }

      return true;

    } catch (Exception e) {
      return false;
    }
  }

  public void enviarNotificacion(TipoTarea objTipoTarea) {

    if (objTipoTarea.isNotificacion() == true) {
      for (TareaGeneral objTareaGeneral : this.alsTareaGeneralxVencer) {
        System.out.println("----------------------------------------");
        System.out.println("------------- Notificacion -------------");
        System.out.println(objTareaGeneral.getAsunto());

        DateFormat formateadorFecha = DateFormat.getDateInstance(java.text.DateFormat.FULL);
        System.out.println("Vencimiento: " + formateadorFecha.format(objTareaGeneral.getFechaVencimiento()));

        System.out.println("Responsable: " + objTareaGeneral.getEmpleadoResponsable().getNombre());
        System.out.println("Comentario: " + objTareaGeneral.getComentario());
        System.out.println("Estado: " + objTareaGeneral.getEstado());
        System.out.println("----------------------------------------");
        System.out.println();

        if (objTipoTarea.isRecordatorio() == true) {
          this.enviarRecordatorio(objTareaGeneral);
        }
      }
    }
  }

  public void enviarRecordatorio(TareaGeneral objTareaGeneral) {
    System.out.println("----------------------------------------");
    System.out.println("------------- Recordatorio -------------");
    System.out.println(objTareaGeneral.getAsunto());

    DateFormat formateadorFecha = DateFormat.getDateInstance(java.text.DateFormat.FULL);
    System.out.println("Vencimiento: " + formateadorFecha.format(objTareaGeneral.getFechaVencimiento()));

    System.out.println("Responsable: " + objTareaGeneral.getEmpleadoResponsable().getNombre());
    System.out.println("----------------------------------------");
    System.out.println();
  }
}