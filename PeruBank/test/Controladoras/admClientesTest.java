package Controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

public class admClientesTest {
  
  admClientes AdmClientes = new admClientes();
  
  // Verifica los ingresos vacios
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
  public void siNoIngresaCantidadCorrectaDeDigitosCodClienteMeDebeDarError(){
    assertFalse(AdmClientes.verificaDigitosCodCliente("12345")); // Se ingresa un código con menos de 8 dígitos
    System.out.println("El Código del Cliente debe tener 8 dígitos.");
  }
  // Verifica si todos los campos estan vacios
  
  
}
