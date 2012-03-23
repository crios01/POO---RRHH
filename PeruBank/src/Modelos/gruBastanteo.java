package Modelos;

public class gruBastanteo {
  private String gruBastanteo;
  private String descripcion;
  
  // Constructor //
  public gruBastanteo(String gruBastanteo, String descripcion) {
    this.gruBastanteo = gruBastanteo;
    this.descripcion = descripcion;
  }
  
  // Getter % Setter //
  public String getGruBastanteo() {
    return gruBastanteo;
  }
  public void setGruBastanteo(String gruBastanteo) {
    this.gruBastanteo = gruBastanteo;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

}
