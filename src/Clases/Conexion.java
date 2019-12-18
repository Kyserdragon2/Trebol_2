package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection conectar = null;

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://10.0.2.3:3306/trebol_2", "admin", "admin");
//            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/trebol_2", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Hubo un error al conectar a la base de datos");
        }
        return conectar;
    }

    public boolean sentenciaSQL(String SQL) throws SQLException {
        Connection cn = Conexion();
//        System.out.println(SQL);
        PreparedStatement CAE = cn.prepareStatement(SQL);
        return !CAE.execute();
    }

    public ResultSet ejecutarSql(String sentencia, boolean retorno) throws SQLException, Exception {
        Connection cn = Conexion();
        Statement st = cn.createStatement();
//        System.out.println(sentencia);
        ResultSet rs;
        rs = st.executeQuery(sentencia);
        return rs;
    }

    public ResultSet consultas(String sql) {
        ResultSet resultado = null;
        try {
//        System.out.println(sql);
            resultado = ejecutarSql(sql, true);
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
