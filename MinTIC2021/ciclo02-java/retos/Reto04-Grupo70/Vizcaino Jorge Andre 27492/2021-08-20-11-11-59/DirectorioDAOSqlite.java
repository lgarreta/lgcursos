import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DirectorioDAOSqlite implements DirectorioDAOInterface {
    // Atributos
    
    Connection con= null;
    Statement sentencia = null;
    ResultSet result= null;
    
    // Metodos
    public void crear () {
        // Inicializa el DAO conectando la base de datos;
    	String url="jdbc:sqlite:bd_estudiantes.db";
    	try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection(url);
			sentencia= con.createStatement();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void adicionar (Estudiante e) {
    	
    	PreparedStatement adici;
        // Adiciona el estudiante "e" al DB, es decir a la base de datos, mediante el codigo sqlite a continuacion:
    	String insert="INSERT INTO Estudiantes(Nombre, Apellido, FechaBirth, CorreoInst, CorreoPer, NroCelular, NroFijo, Programa) VALUES(?,?,?,?,?,?,?,?)";
    	try {
			adici=con.prepareStatement(insert);
			
			adici.setString(1,e.nombres);
			adici.setString(2,e.apellidos);
			adici.setString(3,e.fecha);
			adici.setString(4,e.correoInst);
			adici.setString(5,e.correo);
			adici.setInt (6,(int)e.nroCelular);
			adici.setInt (7,(int)e.nroFijo);
			adici.setString(8,e.programa);
			
			adici.executeUpdate();
			
			
    	} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    	
    }
    
    public Estudiante buscar (String correoInstu) {
        // Busca en la BD el estudiante que tenga el correo igual a "correoInst"
    	Estudiante e = null;
    	try {
            
            String cadena = "'" + correoInstu + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE CorreoInst = " + cadena;
            result = sentencia.executeQuery(consulta);
            
            while (result.next()) {
                // Recuperamos datos de la BD
                
				String nombres = result.getString("Nombre");
				String apellidos = result.getString("Apellido");
				String fecha = result.getString("FechaBirth");
                String correoInst = result.getString("CorreoInst");
                String correoPer = result.getString("CorreoPer");
                long nroCelular = (long) result.getInt ("NroCelular");
                long nrofijo = (long) result.getInt ("NroFijo");
                String program = result.getString("Programa");
                
                e = new Estudiante (nombres, apellidos, fecha, correoInst, correoPer, nroCelular, nrofijo, program);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (e);
    }
    
    public ArrayList <Estudiante> buscarLastName (String apellidos) {
        // Busca en la BD los estudiantes que tengan el apellido igual a "apellidos" por parametro
    	Estudiante e = null;
    	ArrayList <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();
    	
    	try {
            
            String apell = "'" + apellidos + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE Apellido = " + apell;
            result = sentencia.executeQuery(consulta);
            
            while (result.next()) {
                // Recuperamos datos de la BD
                
				String nombres = result.getString("Nombre");
				String apellido = result.getString("Apellido");
				String fecha = result.getString("FechaBirth");
                String correoInst = result.getString("CorreoInst");
                String correoPer = result.getString("CorreoPer");
                long nroCelular = (long) result.getInt ("NroCelular");
                long nrofijo = (long) result.getInt ("NroFijo");
                String program = result.getString("Programa");
                
                e = new Estudiante (nombres, apellido, fecha, correoInst, correoPer, nroCelular, nrofijo, program);
                listaEstudiantes.add (e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (listaEstudiantes);
    }
    
    public ArrayList <Estudiante> buscarProg (String progra) {
        // Busca en la BD el estudiante que tenga el programa igual a "programa" por parametros
    	Estudiante e = null;
    	ArrayList <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();
    	
    	try {
            
            String programa = "'" + progra + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE Programa = " + programa;
            result = sentencia.executeQuery(consulta);
            
            while (result.next()) {
                // Recuperamos datos de la BD
                
				String nombres = result.getString("Nombre");
				String apellido = result.getString("Apellido");
				                
                e = new Estudiante (nombres, apellido, apellido, apellido, apellido, 0, 0, apellido);
                listaEstudiantes.add (e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (listaEstudiantes);
    }
    
    public int buscarContPrograma (String progra) {
        // Busca en la BD el estudiante que tenga el programa igual a "programa" por parametros y devuelve el # de estudiantes
    	// que esten inscritos en el mismo.
    	int size=0;    	
    	
    	try {
            
    		 String programa = "'" + progra + "'";
             String consulta = "SELECT * FROM Estudiantes WHERE Programa = " + programa;
             result = sentencia.executeQuery(consulta);
             
             while (result.next()) {// el .next nos permite recorrer la veces que sean necesarias para conseguir esos estudiantes por programa 
            
            	 size++;// contador para el fin de la funcion ContPrograma
             } 
        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (size);
    }
    
    public ArrayList <Estudiante> buscarBirth (String fecha) {
        // Busca en la BD los estudiantes  que tengan la fecha de nacimineto igual a "fecha" por parametro
    	Estudiante e = null;
    	ArrayList <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();
    	
    	try {
            
            String date = "'" + fecha + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE FechaBirth = " + date;
            result = sentencia.executeQuery(consulta);
            
            while (result.next()) {
                // Recuperamos datos de la BD
                
				String nombres = result.getString("Nombre");
				String apellido = result.getString("Apellido");
				String fechaN = result.getString("FechaBirth");
                String correoInst = result.getString("CorreoInst");
                String correoPer = result.getString("CorreoPer");
                long nroCelular = (long) result.getInt ("NroCelular");
                long nrofijo = (long) result.getInt ("NroFijo");
                String program = result.getString("Programa");
                
                e = new Estudiante (nombres, apellido, fechaN, correoInst, correoPer, nroCelular, nrofijo, program);
                listaEstudiantes.add (e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (listaEstudiantes);
    }
    
    public Estudiante buscarCel (long cel) {
        // Busca en la BD el estudiante que tenga el numero celular igual a "cel" por parametro
    	Estudiante e = null;
    	try {
            
            String celu = "'" + cel + "'";
            String consulta = "SELECT * FROM Estudiantes WHERE NroCelular = " + celu;
            result = sentencia.executeQuery(consulta);
            
            while (result.next()) {
                // Recuperamos datos de la BD, solo el nombre y programa son necesarios en esta funcion
                
				String nombres = result.getString("Nombre");
				String program = result.getString("Programa");
                
                e = new Estudiante (nombres, program, program, program, program, cel, cel, program);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DirectorioDAOSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
		
        return (e);
    }
    
    public void actualizar (String correoInst, Estudiante nuevo) {
        // Buscae en la BD el estudiante que tenga el correo igual al "correoInstu" 
        // y lo cambia por el "nuevo" que llega, mas los demas datos de parametro
    	
        // Actualiza mediante el codigo de sqlite consiguiendo la KEY de la BD, la cual es correoINst
    	try {
    		String actualizar = String.format ("UPDATE Estudiantes SET CorreoPer ='%s', NroCelular ='%s', NroFijo='%s', Programa='%s' WHERE CorreoInst = '%s'", 
    			                               nuevo.correo, nuevo.nroCelular, nuevo.nroFijo ,nuevo.programa, correoInst);
  			
			sentencia.executeUpdate(actualizar);
				
    	} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
    	    	   
    }
    public void eliminar (String correoInst){
        // Elimina al estudiante del DAO que tenga correo igual al que ingresa
    	
    	PreparedStatement del;
        // Elimina el estudiante "e" al DB, es decir a la base de datos
    	// codido sqlite necesario para la operacion de eliminar
    	String eliminar="DELETE FROM Estudiantes WHERE CorreoInst =?";
    	try {
			del=con.prepareStatement(eliminar);
			del.setString(1,correoInst);// elimina la columna donde se escuentra el correo
			del.executeUpdate();
			
    	} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
        
    }
    public ArrayList<Estudiante> obtenerTodos (){
        // Retorna una lista con todos los estudiantes
    	ArrayList <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();
    	
    	String consulta="SELECT * FROM Estudiantes";
    	try {
			result=sentencia.executeQuery(consulta);
			// recorre la BS y guarda en variable Estudiantes para luego agregarlos en una lista
			while(result.next()) {
				// recuperando data de la BD
				
				String nombres = result.getString("Nombre");
				String apellidos = result.getString("Apellido");
				String fecha = result.getString("FechaBirth");
                String correoInst = result.getString("CorreoInst");
                String correoPer = result.getString("CorreoPer");
                long nroCelular = (long) result.getInt ("NroCelular");
                long nrofijo = (long) result.getInt ("NroFijo");
                String program = result.getString("Programa");
                
                Estudiante e = new Estudiante (nombres, apellidos, fecha, correoInst, correoPer, nroCelular, nrofijo, program);
                listaEstudiantes.add (e);
                
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return (listaEstudiantes);
    }
    
    public void cerrarCon() {
    	// cierra la conexion con la base de datos
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    }
    
}
