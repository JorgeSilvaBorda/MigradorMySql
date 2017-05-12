
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Conexion {

    String servidor, baseDato, usuario, pass;
    Connection conn = null;

    public Conexion() {

    }

    public Conexion(String servidor, String baseDato, String usuario, String pass) {
	this.servidor = servidor;
	this.baseDato = baseDato;
	this.usuario = usuario;
	this.pass = pass;
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + baseDato, usuario, pass);
	} catch (SQLException | ClassNotFoundException ex) {
	    System.out.println("No se pudo configurar la conexión.");
	    System.out.println(ex);
	}
    }

    public Conexion(String servidor, String usuario, String pass) {
	this.servidor = servidor;
	this.usuario = usuario;
	this.pass = pass;
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor, usuario, pass);
	} catch (SQLException | ClassNotFoundException ex) {
	    System.out.println("No se pudo configurar la conexión.");
	    System.out.println(ex);
	}
    }

    public boolean testConexion() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor, usuario, pass);
	return true;
    }

    public ResultSet ejecutarQuery(String query) {
	try {
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + baseDato, usuario, pass);
	    Statement st = this.conn.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    return rs;
	} catch (SQLException ex) {
	    System.out.println("No se ha podido ejecutar la query: ");
	    System.out.println(query);
	}
	return null;
    }

    public void ejecutar(String query) {
	try {
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + baseDato, usuario, pass);
	    Statement st = this.conn.createStatement();
	    ResultSet rs = st.executeQuery(query);
	} catch (SQLException ex) {
	    System.out.println("No se ha podido ejecutar la query: ");
	    System.out.println(query);
	    System.out.println(ex);
	}
    }
    
    public void crearBase(String nombreBase) {
	try {
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor, usuario, pass);
	    Statement st = this.conn.createStatement();
	    st.executeUpdate("CREATE DATABASE " + nombreBase);
	} catch (SQLException ex) {
	    System.out.println("No se ha podido crear la base de datos: ");
	    System.out.println(nombreBase);
	    System.out.println(ex);
	}
    }
    
    public void crear(String query) {
	try {
	    this.conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + baseDato, usuario, pass);
	    Statement st = this.conn.createStatement();
	    st.executeUpdate(query);
	} catch (SQLException ex) {
	    System.out.println("No se ha podido crear: ");
	    System.out.println(query);
	    System.out.println(ex);
	}
    }

    public String[] traerBases() throws SQLException {
	LinkedList<String> bases = new LinkedList();
	ResultSet rs = this.conn.getMetaData().getCatalogs();
	while (rs.next()) {
	    bases.add(rs.getString(1));
	}
	String[] base = new String[bases.size()];
	for (int i = 0; i < base.length; i++) {
	    base[i] = bases.get(i);
	}
	return base;
    }

    public void cerrar() {
	if (this.conn != null) {
	    try {
		this.conn.close();
	    } catch (SQLException ex) {
		System.out.println("No se pudo cerrar la conexión.");
		System.out.println(ex);
	    }
	}
    }
}
