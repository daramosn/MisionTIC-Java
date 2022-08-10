package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.model.Employee;

/**
 * JDBC SQlite
 *
 */
public class App {
    public static void main(String[] args) {

        // -----------------------------------------Prueba
        // String direccionDB = "D://Documentos/Documentos
        // personales/Curso/MinTIC/Ciclo2_Java/Semana3/hr.db";

        // String url = "jdbc:sqlite:" + direccionDB;

        // Connection conn = null;
        // Statement stmt = null;
        // ResultSet rs = null;

        // try {
        // conn = DriverManager.getConnection(url);
        // stmt = conn.createStatement();
        // String sql = "SELECT employee_id, first_name, last_name, email FROM
        // employees";

        // rs = stmt.executeQuery(sql);

        // while (rs.next()) {
        // int id = rs.getInt("employee_id");
        // String nombre = rs.getString("first_name");
        // String apellido = rs.getString(3);

        // System.out.println("(" + id + ")" + nombre + " " + apellido);
        // }

        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        String direccionDB = "D://Documentos/Documentos personales/Curso MinTIC/Ciclo2_Java/Semana3/hr.db";

        String url = "jdbc:sqlite:" + direccionDB;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        var listEmployee = new ArrayList<Employee>();

        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();

            String sql = "SELECT employee_id, first_name, last_name, email FROM employees LIMIT 10";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employee emp = new Employee();

                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                String correo = rs.getString("email");

                emp.setEmployee_id(id);
                emp.setFirst_name(nombre);
                emp.setLast_name(apellido);
                emp.setEmail(correo);

                listEmployee.add(emp);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        for (Employee emp : listEmployee) {
            System.out.println(emp.getEmail() + ", " + emp.getFirst_name());
        }

    }
}
