
import java.io.Serializable;

/**
 * Guarda la configuración de la base de datos de destino.
 * @author Jorge Silva Borda
 */
public class ConfigDestino implements Serializable {
    private static final long serialVersionUID = 1L;
    private String servidor, usuario, password, baseDato;

    public ConfigDestino() {
    }

    public ConfigDestino(String servidor, String usuario, String password, String baseDato) {
	this.servidor = servidor;
	this.usuario = usuario;
	this.password = password;
	this.baseDato = baseDato;
    }

    public String getServidor() {
	return servidor;
    }

    public void setServidor(String servidor) {
	this.servidor = servidor;
    }

    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getBaseDato() {
	return baseDato;
    }

    public void setBaseDato(String baseDato) {
	this.baseDato = baseDato;
    }
    
    
}
