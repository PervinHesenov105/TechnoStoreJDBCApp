/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.dao.impl.ProductDaoImpl;
import az.perfect.dao.impl.StoreDaoImpl;
import az.perfect.dao.inter.ProductDaoInter;
import az.perfect.dao.inter.StoreDaoInter;

/**
 *
 * @author Perfect
 */
public class Context {

    public static ProductDaoInter instanceProductDao() {
        return new ProductDaoImpl();
    }
    public static StoreDaoInter instanceStoreDao(){
        return new StoreDaoImpl();
    }
    
    

}
