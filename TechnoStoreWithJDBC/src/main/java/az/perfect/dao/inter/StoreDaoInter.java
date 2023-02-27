/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.perfect.dao.inter;


import az.perfect.entity.Store;
import java.util.List;

/**
 *
 * @author nizam
 */
public interface StoreDaoInter {
    
    void insert(Store s);

    void update(Store s);

    void delete(int id);

    List<Store> getAllStores();

    Store getStoreById(int id);
    
}
