/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;


/**
 *
 * @author PhongVu
 */
public class DatabaseUtils {
    public static final String connectionUrl="jdbc:jtds:sqlserver://CAIQUOCDAT:1433/DemoTinhTien";
    public static Connection getDBConnect(){
        
        try {
            Connection con = null;
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con=DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("Where is Driver?");
            System.out.println("Error: "+e.toString());
        }catch (SQLException ex){
            //Loi ket noi
            System.out.println("Error: "+ex.toString());
        }
        return null;
    }
    public void ReportHoaDon() throws SQLException, JRException
    {
        try {
            Connection con = null;
            con=DriverManager.getConnection(connectionUrl);
            String REPORT ="C:\\Users\\PhongVu\\OneDrive - University of Technology and Education\\Documents\\NetBeansProjects\\CuoiKiJaVaNangCao\\src\\report\\report5.jrxml";
            JasperReport JASP_REP=JasperCompileManager.compileReport(REPORT);
            JasperPrint JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
            JasperViewer.viewReport(JASP_PRINT);
        } catch (Exception e) {
        }
            
            
        
    }
     public void ReportTongDoanhThu() throws SQLException, JRException
    {
        try {
            Connection con = null;
            con=DriverManager.getConnection(connectionUrl);
            String REPORT ="C:\\Users\\PhongVu\\OneDrive - University of Technology and Education\\Documents\\NetBeansProjects\\CuoiKiJaVaNangCao\\src\\report\\report6.jrxml";
            JasperReport JASP_REP=JasperCompileManager.compileReport(REPORT);
            JasperPrint JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
            JasperViewer.viewReport(JASP_PRINT);
        } catch (Exception e) {
        }
            
            
        
    }
}
