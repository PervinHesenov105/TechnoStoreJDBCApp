/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.dao.inter.StoreDaoInter;
import az.perfect.entity.Category;
import az.perfect.entity.Product;
import az.perfect.entity.Store;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author nizam
 */
public class StoreDaoImpl implements StoreDaoInter {

    public StoreDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Store s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Store s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Store> getAllStores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Store getStoreById(int id) {
        Store s = null;
        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT s.* from store s where id=" + id);

            while (rs.next()) {
                int sid = rs.getInt("id");
                String store_name = rs.getNString("store_name");
                String location = rs.getNString("location");
                String phone = rs.getNString("phone");
                s = new Store (sid,store_name,location,phone);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return s;
    }

}
