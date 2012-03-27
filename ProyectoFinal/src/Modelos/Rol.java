package Modelos;

import Interfaces.IMantenimiento;

public class Rol extends Auditoria implements IMantenimiento {

  private int rol_id;
  private String nombre;
  private String descripcion;

  public int getRol_id() {
    return rol_id;
  }

  public void setRol_id(int rol_id) {
    this.rol_id = rol_id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
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
}