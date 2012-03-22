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
  public void siCodigoClienteNoExisteMeDebeRetornarError() {
    assertFalse(AdmClientes.verificaExisteCodCliente("024")); //Código de Cliente no existente
    System.out.println("El Código de Cliente no existe");
  }
  @Test
  public void siRucClienteNoExisteMeDebeRetornarError() {
    assertFalse(AdmClientes.verificaExisteRuc("12345678901")); //RUC de Cliente no existente
    System.out.println("El RUC de Cliente no existe");
  }
  // Verifica campos vacios
  @Test
  public void siNoIngresaElCodigoDeClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaCodCliente(null));
    System.out.println("El Código de Cliente no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaRazonSocialMeDebeDarError() {
    assertFalse(AdmClientes.verificaRazonSocial(null));
    System.out.println("La Razón Social no debe estar vacio.");
  }
  @Test
  public void siNoIngresaElRucMeDebeDarError() {
    assertFalse(AdmClientes.verificaRuc(null));
    System.out.println("El RUC no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaFechaDeInicioMeDebeDarError() {
    assertFalse(AdmClientes.verificaFechaInicio(null));
    System.out.println("La Fecha de Inicio no debe estar vacio.");
  }
  @Test
  public void siNoIngresaTipoDeEmpresaMeDebeDarError() {
    assertFalse(AdmClientes.verificaTipEmpresa(null));
    System.out.println("El Código del Tipo de Empresa no debe estar vacio.");
  }
  @Test
  public void siNoIngresaLaCantidadDeEmpleadosMeDebeDarError() {
    assertFalse(AdmClientes.verificaCanEmpleados(0));
    System.out.println("La Cantidad de Empleados debe ser mayor que cero.");
  }
  // Verifica la cantidad de dígitos.
  @Test
  public void siNoIngresaLaCantidadCorrectaDigitosDelCodigoDelClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaCanDigitosCodCliente("12345")); // Se ingresa un código con menos de 8 dígitos
    System.out.println("El Código del Cliente debe tener 8 dígitos.");
  }
  @Test
  public void siNoIngresaLaCantidadCorrectaDigitosDelRucDelClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaCanDigitosRucCliente("1234567"));
    System.out.println("El RUC debe tener 11 digitos");
  }
  @Test
  public void siNoIngresaDigitosEnDelRucDelClienteMeDebeDarError() {
    assertFalse(AdmClientes.verificaDigitosRuc("2356E773060"));
    System.out.println("El RUC solo debe contener Dígitos.");
  }
  @Test
  public void siNoIngresaElDigitoInicialDelRucDelClienteCorrectoMeDebeDarError() {
    assertFalse(AdmClientes.verificaDigitoInicialRuc("30494995032"));
    System.out.println("El Dígito Inicial del RUC debe ser 1 ó 2");
  }

  // Acierto en el ingreso de los Datos //
  // ================================== //
  // Verifica si cliente existe
  @Test
  public void siCodigoDeClienteExisteMeDebeRetornarOK() {
    assertTrue(AdmClientes.verificaExisteCodCliente("004"));
    System.out.println("El Cliente Existe");
  }
  @Test
  public void siRucDeClienteExisteMeDebeRetornarOK() {
    assertTrue(AdmClientes.verificaExisteRuc("20527600031"));
    System.out.println("El RUC ya existe");
  }
  // Verifica campos vacios
  @Test
  public void siIngresaElCodigoDeClienteMeDebeDarOK() {
    assertTrue(AdmClientes.verificaCodCliente("002"));
    System.out.println("El Código de Cliente es valido");
  }
  @Test
  public void siIngresaLaRazonSocialMeDebeDarOK() {
    assertTrue(AdmClientes.verificaRazonSocial("PETROPERU"));
    System.out.println("La Razón Social del Cliente es valida");
  }
  @Test
  public void siIngresaElRucMeDebeDarOK(){
    assertTrue(AdmClientes.verificaRuc("20100020445"));
    System.out.println("El RUC del Cliente es valido");
  }
  @Test
  public void siIngresaLaFechaDeInicioMeDebeDarOK(){
    assertTrue(AdmClientes.verificaFechaInicio("23/10/2005"));
    System.out.println("La Fecha de Inicio de operaciones es correcta");
  }
  @Test
  public void siIngresaElTipoDeEmpresaMeDebeDarOK(){
    assertTrue(AdmClientes.verificaTipEmpresa("009"));
    System.out.println("Tipo de Empresa es valida");
  }
  @Test
  public void siIngresaLaCantidadDeEmpleadosMeDebeDarOK(){
    assertTrue(AdmClientes.verificaCanEmpleados(250));
    System.out.println("Cantidad de Empleados correcta");
  }
  // Verifica la cantidad de dígitos //
  @Test
  public void siIngresaLaCantidadCorrectaDeDigitosDelCodigoDelClienteMeDebeDarOK(){
    assertTrue(AdmClientes.verificaCanDigitosCodCliente("12345678"));
    System.out.println("La Cantidad de dígitos del Código del Cliente es correcta");
  }
  @Test
  public void siIngresaLaCantidadCorrectaDeDigitosDelRucDelClienteMeDebeDarOK(){
    assertTrue(AdmClientes.verificaCanDigitosRucCliente("12345678901"));
    System.out.println("La Cantidad de dígitos del RUC del Cliente es correcta");
  }
  @Test
  public void siIngresaDigitosEnElRucDelClienteMeDebeDarOK(){
    assertTrue(AdmClientes.verificaDigitosRuc("12345678901"));
    System.out.println("Todos los caracteres del RUC son dígitos");
  }
  @Test
  public void siIngresaElDigitoInicialDelRucDelClienteCorrectoMeDebeDarOK(){
    assertTrue(AdmClientes.verificaDigitoInicialRuc("12345678901"));
    System.out.println("El primer dígito del RUC es correcto");
  }
}
