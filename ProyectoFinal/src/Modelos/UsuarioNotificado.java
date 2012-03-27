package Modelos;

public class UsuarioNotificado {

  private Tarea tarea;
  private Usuario usuario;

  public Tarea getTarea() {
    return tarea;
  }

  public void setTarea(Tarea tarea) {
    this.tarea = tarea;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public UsuarioNotificado(Tarea tarea, Usuario usuario) {
    super();
    this.tarea = tarea;
    this.usuario = usuario;
  }
}