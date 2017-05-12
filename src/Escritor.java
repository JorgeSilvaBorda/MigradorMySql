
import java.io.*;

/**
 * Guarda las configuraciones de las bases de datos.
 *
 * @author Jorge Silva Borda
 */
public class Escritor {

    public Escritor() {
    }

    public String escribirDestino(ConfigDestino config) {
	FileOutputStream fout = null;
	ObjectOutputStream oos = null;
	try {
	    fout = new FileOutputStream("conf-out.conf");
	    oos = new ObjectOutputStream(fout);
	    oos.writeObject(config);
	    return "Configuración de destino guardada correctamente.";
	} catch (Exception ex) {
	    return "No se ha podido guardar la configuración de destino de la base de datos." + System.getProperty("line.separator") + ex;
	} finally {
	    if (fout != null) {
		try {
		    fout.close();
		} catch (Exception ex) {
		    System.out.println("No se pudo cerrar la salida FOUT.");
		    System.out.println(ex);
		}
	    }

	    if (oos != null) {
		try {
		    oos.close();
		} catch (Exception ex) {
		    System.out.println("No se pudo cerrar la salida OOS.");
		    System.out.println(ex);
		}
	    }
	}
    }

    public String escribirOrigen(ConfigOrigen config) {
	FileOutputStream fout = null;
	ObjectOutputStream oos = null;
	try {
	    fout = new FileOutputStream("conf-in.conf");
	    oos = new ObjectOutputStream(fout);
	    oos.writeObject(config);
	    return "Configuración de origen guardada correctamente.";
	} catch (Exception ex) {
	    return "No se ha podido guardar la configuración de origen de la base de datos." + System.getProperty("line.separator") + ex;
	} finally {
	    if (fout != null) {
		try {
		    fout.close();
		} catch (Exception ex) {
		    System.out.println("No se pudo cerrar la salida FOUT.");
		    System.out.println(ex);
		}
	    }

	    if (oos != null) {
		try {
		    oos.close();
		} catch (Exception ex) {
		    System.out.println("No se pudo cerrar la salida OOS.");
		    System.out.println(ex);
		}
	    }
	}
    }

}
