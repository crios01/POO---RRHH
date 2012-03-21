package Controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

public class admClientesTest {
  
  admClientes AdmClientes = new admClientes();
  
  @Test
  public void siNoIngresaElCodigoClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaCodCliente(null));
    System.out.println("El Código de Cliente no debe estar vacio");
  }
  
  @Test
  public void siNoIngresaLaRazonSocialMeDebeDarError(){
    assertFalse(AdmClientes.verificaRazonSocial(null));
    System.out.println("La Razón Social no debe estar vacio");
  }
  
  @Test
  public void siNoIngresaElRucMeDebeDarError(){
    assertFalse(AdmClientes.verificaRuc(null));
    System.out.println("El RUC no debe estar vacio");
  }
  
}
