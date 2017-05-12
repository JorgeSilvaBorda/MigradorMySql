
import java.io.Serializable;

/**
 * Guarda la configuración de la base de datos de origen de la conexión.
 * @author Jorge Silva Borda
 */
public class ConfigOrigen implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String servidor, usuario, password, baseDato;

    public ConfigOrigen() {
	
    }

    public ConfigOrigen(String servidor, String usuario, String password, String baseDato) {
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
    
    @Override
    public String toString(){
	return "Configuración Origen: " + this.getServidor() + " " + this.getUsuario() + " " + this.getBaseDato() + " " + this.getPassword();
    }
}
