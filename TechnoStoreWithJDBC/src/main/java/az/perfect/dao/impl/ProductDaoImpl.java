/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.dao.impl;

import az.perfect.dao.inter.ProductDaoInter;
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
 * @author Perfect
 */
public class ProductDaoImpl implements ProductDaoInter {

    @Override
    public void insert(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product getProductById(int id) {
        Product p = null;
        try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/technostore",
                "boot1", "1234")) {

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT p.*, c.category_name, s.store_name, s.location,s.phone FROM "
                    + "product p INNER JOIN category c ON p.category_id = c.id  "
                    + "LEFT JOIN store s ON p.store_id = s.id where p.id= " + id);

            while (rs.next()) {
                int pid = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                Category category = new Category(rs.getInt("category_id"), rs.getString("category_name"));
                Store store = new Store(rs.getInt("store_id"), rs.getString("store_name"), rs.getString("location"), rs.getString("phone"));
                p = new Product(pid, name, price, quantity, category, store);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

}
