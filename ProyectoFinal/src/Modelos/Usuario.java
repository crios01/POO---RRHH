package Modelos;

import Interfaces.IMantenimiento;

public class Usuario extends Auditoria implements IMantenimiento {

  private int usuario_id;
  private Rol rol;
  private String usuario;
  private String clave;
  private String dni;
  private String nombre;
  private Empleado empleado;

  public Usuario(int usuario_id, Rol rol, String usuario, String clave, Empleado empleado) {
    this.usuario_id = usuario_id;
    this.rol = rol;
    this.usuario = usuario;
    this.clave = clave;
    this.dni = null;
    this.nombre = null;
    this.empleado = empleado;
  }

  public Usuario(String dni, String nombre, String clave) {
    this.dni = dni;
    this.nombre = nombre;
    this.clave = clave;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getUsuario_id() {
    return usuario_id;
  }

  public void setUsuario_id(int usuario_id) {
    this.usuario_id = usuario_id;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public Empleado getEmpleado() {
    return empleado;
  }

  public void setEmpleado(Empleado empleado) {
    this.empleado = empleado;
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