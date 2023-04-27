/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author prach
 */
public class BillDetails extends JFrame{
    BillDetails(String meter){
        setSize(700,650);
        setLocation(400,150);
        
        getContentPane().setBackground(Color.white);
        JTable table=new JTable();
        try{
            Conn con=new Conn();
            String query="select * from bill where meter_no='"+meter+"'";
            ResultSet rs=con.stmt.executeQuery(query);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp=new JScrollPane(table);
        sp.setBounds(0,0,700,650);
        add(sp);
        setVisible(true);
    }
    public static void main(String[]args){
        new BillDetails("");
    }
}
