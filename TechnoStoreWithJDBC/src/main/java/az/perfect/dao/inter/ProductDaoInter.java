/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;

import az.perfect.entity.Product;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface ProductDaoInter {

    void insert(Product p);

    void update(Product p);

    void delete(int id);

    List<Product> getAllProducts();

    Product getProductById(int id);
}
