package Modelos;

import Interfaces.IMantenimiento;

public class Modulo extends Auditoria implements IMantenimiento {

  private int modulo_id;
  private String nombre;
  private String descripcion;

  public int getModulo_id() {
    return modulo_id;
  }
  public void setModulo_id(int modulo_id) {
    this.modulo_id = modulo_id;
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
    return false;
    // TODO Auto-generated method stub
  }
  @Override
  public boolean editar() {
    return false;
    // TODO Auto-generated method stub
  }
  @Override
  public boolean eliminar() {
    return false;
    // TODO Auto-generated method stub
  }

}