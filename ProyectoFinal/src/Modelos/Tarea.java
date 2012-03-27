package Modelos;

import java.util.Date;
import Interfaces.IMantenimiento;

public class Tarea extends Auditoria implements IMantenimiento {

  private int tarea_id;
  private Usuario usuario;
  private Empleado empleado;
  private TipoTarea tipoTarea;
  private Empleado empleadoResponsable;
  private Date fechaVencimiento;
  private String comentario;
  private Date fechaTermino;
  private String estado;

  public int getTarea_id() {
    return tarea_id;
  }
  public void setTarea_id(int tarea_id) {
    this.tarea_id = tarea_id;
  }

  public Usuario getUsuario() {
    return usuario;
  }
  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Empleado getEmpleado() {
    return empleado;
  }
  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
  }

  public TipoTarea getTipoTarea() {
    return tipoTarea;
  }
  public void setTipoTarea(TipoTarea tipoTarea) {
    this.tipoTarea = tipoTarea;
  }

  public Empleado getEmpleadoResponsable() {
    return empleadoResponsable;
  }
  public void setEmpleadoResponsable(Empleado empleadoResponsable) {
    this.empleadoResponsable = empleadoResponsable;
  }

  public Date getFechaVencimiento() {
    return fechaVencimiento;
  }
  public void setFechaVencimiento(Date fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }

  public String getComentario() {
    return comentario;
  }
  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public Date getFechaTermino() {
    return fechaTermino;
  }

  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setFechaTermino(Date fechaTermino) {
    this.fechaTermino = fechaTermino;
  }

  @Override
  public void buscar() {
    // TODO Auto-generated method stub
  }

  @Override
  public boolean adicionar() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean editar() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean eliminar() {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean asignarTarea() {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean actualizarEstado(String estado_id) {
    return false;
  }
}