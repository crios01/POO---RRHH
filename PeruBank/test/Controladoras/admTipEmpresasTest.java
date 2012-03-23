package Controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

public class admTipEmpresasTest {
  
  admTipEmpresas AdmTipEmpresas = new admTipEmpresas();
  
  // Error en el Ingreso de Datos //
  // ============================ //
  // Verifica si Tipo de Empresa Existe //
  @Test
  public void siCodigoDelTipoDeEmpresaNoExisteMeDebeDarError(){
    assertFalse(AdmTipEmpresas.verificaTipEmpresa("080"));
    System.out.println("El Código de Tipo de Empresa no existe");
  }
  
  // Acierto en el Ingreso de Datos //
  // ============================== //
  // Verifica si Tipo de Empresa Existe //
  @Test
  public void siCodigoDelTipoDeEmpresaExisteMeDebeDarOK(){
    assertTrue(AdmTipEmpresas.verificaTipEmpresa("001"));
    System.out.println("El Código de Tipo de Empresa existe");
  }
}
