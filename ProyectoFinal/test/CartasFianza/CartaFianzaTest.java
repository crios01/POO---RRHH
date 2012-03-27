package CartasFianza;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class CartaFianzaTest {

  public CartaFianzaTest() {
  }

  @Test
  public void buscarCartaFianzaExistente() {
    System.out.println("Validamos la busqueda de Carta Fianza existente"); // imprime mensaje
    String codCartaFianza = "CF-001";
    String strProveedor = "";
    List<CartaFianza> listaCartaFianza = new ListasCartasFianza().getListaCartaFianza();
    AdmCartaFianza admCartaFianza = new AdmCartaFianza(listaCartaFianza);

    int expResult = 1;
    int filaResultado = 0;

    List<CartaFianza> listaResultado = admCartaFianza.buscarCartaFianza(codCartaFianza, strProveedor);
    if (listaResultado != null) {
      filaResultado = listaResultado.size();

    }

    assertEquals(expResult, filaResultado);

  }

  @Test
  public void buscarCartaFianzaInexistente() {
    System.out.println("Se inserto un codigo de Carta Fianza inexistente"); // imprime mensaje
    String codCartaFianza = "CF-011";
    String strProveedor = "";
    List<CartaFianza> listaCartaFianza = new ListasCartasFianza().getListaCartaFianza();
    AdmCartaFianza admCartaFianza = new AdmCartaFianza(listaCartaFianza);

    int expResult = 0;
    int filaResultado = 0;


    List<CartaFianza> listaResultado = admCartaFianza.buscarCartaFianza(codCartaFianza, strProveedor);
    if (listaResultado != null) {
      filaResultado = listaResultado.size();

    }

    assertEquals(expResult, filaResultado);

  }

  @Test
  public void buscarCartaFianzaXProveedorExistente() {
    System.out.println("Buscamos Carta Fianza por Proveedor existente "); // imprime mensaje
    String codCartaFianza = "";
    String strProveedor = "Proveedor1";
    List<CartaFianza> listaCartaFianza = new ListasCartasFianza().getListaCartaFianza();
    AdmCartaFianza admCartaFianza = new AdmCartaFianza(listaCartaFianza);

    int expResult = 1;
    int filaResultado = 0;

    List<CartaFianza> listaResultado = admCartaFianza.buscarCartaFianza(codCartaFianza, strProveedor);
    if (listaResultado != null) {
      filaResultado = listaResultado.size();

    }
    assertEquals(expResult, filaResultado);

  }

  @Test
  public void buscarCartaFianzaXProveedorInexistente() {
    System.out.println("Se busca carta Fianza para un Proveedor inexistente "); // imprime mensaje
    String codCartaFianza = "";
    String strProveedor = "Proveedor10";
    List<CartaFianza> listaCartaFianza = new ListasCartasFianza().getListaCartaFianza();
    AdmCartaFianza admCartaFianza = new AdmCartaFianza(listaCartaFianza);

    int expResult = 0;
    int filaResultado = 0;

    List<CartaFianza> listaResultado = admCartaFianza.buscarCartaFianza(codCartaFianza, strProveedor);
    if (listaResultado != null) {
      filaResultado = listaResultado.size();

    }
    assertEquals(expResult, filaResultado);
  }
}