package CartasFianza;

import java.util.ArrayList;
import java.util.List;

public class ControlCarta {

  private List<Object> list = new ArrayList<Object>();
  private String cartafianza;
  private String proveedor;
  private String tarea;

  public ControlCarta(String tarea, String cartafianza, String proveedor) {
    this.cartafianza = cartafianza;
    this.proveedor = proveedor;
    this.tarea = tarea;

  }

  public void settarea(String tarea) {
    this.tarea = tarea;
  }

  public Object gettarea() {
    return tarea;
  }

  public void setcartafianza(String cartafianza) {
    this.cartafianza = cartafianza;
  }

  public Object getcartafianza() {
    return cartafianza;
  }

  public void setproveedor(String proveedor) {
    this.proveedor = proveedor;
  }

  public Object getproveedor() {
    return proveedor;
  }

  public List<Object> getList() {
    return list;
  }

  public void setList(List<Object> list) {
    this.list = list;
  }
}