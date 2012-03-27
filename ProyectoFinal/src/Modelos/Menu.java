package Modelos;

public class Menu {

  private int menu_id;
  private String nombre;
  private Modulo modulo;

  public int getMenu_id() {
    return menu_id;
  }
  public void setMenu_id(int menu_id) {
    this.menu_id = menu_id;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Modulo getModulo() {
    return modulo;
  }
  public void setModulo(Modulo modulo) {
    this.modulo = modulo;
  }

}