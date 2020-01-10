package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    Connection conectar = null;

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://10.0.2.13:3306/trebol_2", "admin", "AdminDB*2019");
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
}
