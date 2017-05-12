
import java.io.*;

/**
 * Lee los archivos de configuración de base de datos guardados.
 *
 * @author Jorge Silva Borda
 */
public class Lector {

    public ConfigOrigen leerConfOrigen() {
	try {
	    File origen = new File("conf-in.conf");
	    if (origen.exists()) {
		FileInputStream fin = new FileInputStream(origen);
		ObjectInputStream oin = new ObjectInputStream(fin);
		ConfigOrigen conf = (ConfigOrigen) oin.readObject();
		oin.close();
		fin.close();
		return conf;
	    }

	} catch (Exception ex) {
	    System.out.println("No se pudo leer la configuración de origen.");
	    return null;
	}
	return null;
    }
    
    public ConfigDestino leerConfDestino() {
	try {
	    File origen = new File("conf-out.conf");
	    if (origen.exists()) {
		FileInputStream fin = new FileInputStream(origen);
		ObjectInputStream oin = new ObjectInputStream(fin);
		ConfigDestino conf = (ConfigDestino) oin.readObject();
		oin.close();
		fin.close();
		return conf;
	    }

	} catch (Exception ex) {
	    System.out.println("No se pudo leer la configuración de destino.");
	    return null;
	}
	return null;
    }
}
