package principal.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null; //Variable global de DAO para manejar el entorno de conexión y se guardará la misma, en ésta recibirá la url, usuario y contraseña para conectarse
    protected ResultSet resultado = null; //Variable global de DAO para guardar el resultado de una consulta
    protected Statement sentencia = null; //Variable global de DAO

    private final String USER = "root"; //Valor absouluto usado para guardar el usuario
    private final String PASSWORD = "root"; //Valor absoluto usado para guardar la contraseña del usuario
    private final String DATABASE = "perros"; //Valor absoluto usado para guardar la base de datos
    private final String DRIVER = "com.mysql.jdbc.Driver"; //Valor absoluto el paquete "Driver" que se usará como cable para conectar con MYSQL

    protected void conectarBase() throws Exception { //Como lo dice su nombre su función será conectar a la base de datos
        try {
            Class.forName(DRIVER); //Le pasamos el driver "Driver class"
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false"; //URL de la base de datos
            //DriverManager es una clase que tiene un método getConnection que recibe como parametros url, usuario y password y devolverá un objeto de la clase Connection para conectar con la base de datos
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD); //Hará la conexión
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    protected void desconectarBase() throws Exception {//Como lo dice su nombre su función será desconectar a la base de datos
        try {//Comprobará si hay algo en resultado, sentencia y conexión, y si hay, lo cerrará
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception { //Método por defecto para insertar, modificar y eliminar, que será usado por las clases services y daos
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            //conexion.rollback();
            /*
                Descomentar la línea anterior para tener en cuenta el rollback.
                Correr el siguiente script en Workbench
                SET autocommit = 1;
                COMMIT;
          **Sin rollback igual anda
             */
            throw e;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws Exception {//Método por defecto para consultar que será usado por las clases services y daos
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
