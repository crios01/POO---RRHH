package Controladoras;

import Modelos.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class admClientesTest {
  
  admClientes AdmClientes = new admClientes();
    
  // Error en el ingreso de los Datos //
  // ================================ //
  // Verifica si Cliente existe
  @Test
  public void siCodigoClienteNoExisteMeDebeRetornarError(){
    assertFalse(AdmClientes.verificaExisteCodCliente("024")); //Código de Cliente ya existente
    System.out.println("El Código de Cliente ya existe y debe ser nuevo");
  }
  @Test
  public void siRucClienteNoExisteMeDebeRetornarError(){
    assertFalse(AdmClientes.verificaExisteRuc("12345678901")); //RUC de Cliente ya existente
    System.out.println("El RUC de Cliente ya existe y debe ser nuevo");
  }
  // Verifica campos vacios
  @Test
  public void siNoIngresaElCodigoClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaCodCliente(null));
    System.out.println("El Código de Cliente no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaRazonSocialMeDebeDarError(){
    assertFalse(AdmClientes.verificaRazonSocial(null));
    System.out.println("La Razón Social no debe estar vacio.");
  }
  @Test
  public void siNoIngresaElRucMeDebeDarError(){
    assertFalse(AdmClientes.verificaRuc(null));
    System.out.println("El RUC no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaFechaInicioMeDebeDarError(){
    assertFalse(AdmClientes.verificaFechaInicio(null));
    System.out.println("La Fecha de Inicio no debe estar vacio.");
  }
  @Test
  public void siNoIngresaTipoEmpresaMeDebeDarError(){
    assertFalse(AdmClientes.verificaTipEmpresa(null));
    System.out.println("El Código del Tipo de Empresa no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaCantidadEmpleadosMeDebeDarError(){
    assertFalse(AdmClientes.verificaCanEmpleados(0));
    System.out.println("La Cantidad de Empleados debe ser mayor que cero.");
  }
  // Verifica la cantidad de dígitos.
  @Test
  public void siNoIngresaCantidadCorrectaDigitosCodClienteMeDebeDarError(){
    assertFalse(AdmClientes.verificaDigitosCodCliente("12345")); // Se ingresa un código con menos de 8 dígitos
    System.out.println("El Código del Cliente debe tener 8 dígitos.");
  }
  @Test
  public void siNoIngresaCantidadCorrectaDigitosRucClienteMeDebeDarError(){
    assertFalse(AdmClientes.verificaDigitosRucCliente("1234567"));
    System.out.println("El RUC debe tener 11 digitos");
  }
  @Test
  public void siNoIngresaDigitoInicialDeRucCorrectoMeDebeDarError(){
    assertFalse(AdmClientes.verificaDigitoInicialRuc("30494995032"));
    System.out.println("El Dígito Inicial del RUC debe ser 1 ó 2");
  }
  
  // Acierto en el ingreso de los Datos //
  // ================================== //
  // Verifica si cliente existe
  @Test
  public void siCodigoClienteExisteMeDebeRetornarOK(){
    assertTrue(AdmClientes.verificaExisteCodCliente("004"));
    System.out.println("El Cliente Existe");
  }
  @Test
  public void siRucClienteExisteMeDebeRetornarOK(){
    assertTrue(AdmClientes.verificaExisteRuc("20527600031"));
    System.out.println("El RUC ya existe");
  }
  
}
