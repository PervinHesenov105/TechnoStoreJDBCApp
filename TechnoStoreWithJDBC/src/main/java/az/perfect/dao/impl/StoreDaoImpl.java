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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nizam
 */
public class StoreDaoImpl implements StoreDaoInter {

    public StoreDaoImpl() {
        
    }

    @Override
    public void insert(Store s) {
        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            PreparedStatement st = conn.prepareStatement("insert into store values(?,?,?,?)");
            st.setInt(1, s.getId());
            st.setString(2, s.getStore_name());
            st.setString(3, s.getLocation());
            st.setString(4, s.getPhone());
            

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Store s) {
        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            PreparedStatement st = conn.prepareStatement("update store set store_name=?,location=?,phone=? where id=?");
            st.setString(1, s.getStore_name());
            st.setString(2, s.getLocation());
            st.setString(3, s.getPhone());
            st.setInt(4, s.getId());

            st.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int id
    ) {
        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            Statement st = conn.createStatement();
            st.execute("delete from store where id=" + id);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Store> getAllStores() {
        List<Store> list = new ArrayList();

        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT s.* from store s");

            while (rs.next()) {
                int sid = rs.getInt("id");
                String store_name = rs.getNString("store_name");
                String location = rs.getNString("location");
                String phone = rs.getNString("phone");
                Store s = new Store(sid, store_name, location, phone);
                list.add(s);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Store getStoreById(int id
    ) {
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
                s = new Store(sid, store_name, location, phone);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return s;
    }

}
