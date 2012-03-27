package Modelos;

import java.util.Date;

public class Auditoria {

  private Date fechaCreacion;
  private Date UsuarioCreacion;
  private String ipCreacion;
  private Date fechaModificacion;
  private Date UsuarioModificacion;
  private String ipModificacion;

  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public Date getUsuarioCreacion() {
    return UsuarioCreacion;
  }

  public void setUsuarioCreacion(Date usuarioCreacion) {
    UsuarioCreacion = usuarioCreacion;
  }

  public String getIpCreacion() {
    return ipCreacion;
  }

  public void setIpCreacion(String ipCreacion) {
    this.ipCreacion = ipCreacion;
  }

  public Date getFechaModificacion() {
    return fechaModificacion;
  }

  public void setFechaModificacion(Date fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

  public Date getUsuarioModificacion() {
    return UsuarioModificacion;
  }

  public void setUsuarioModificacion(Date usuarioModificacion) {
    UsuarioModificacion = usuarioModificacion;
  }

  public String getIpModificacion() {
    return ipModificacion;
  }

  public void setIpModificacion(String ipModificacion) {
    this.ipModificacion = ipModificacion;
  }
}