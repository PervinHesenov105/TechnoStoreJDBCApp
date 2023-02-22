/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package az.perfect;

import az.perfect.config.Context;
import az.perfect.dao.inter.ProductDaoInter;

/**
 *
 * @author Perfect
 */
public class TechnoStoreWithJDBC {

    public static void main(String[] args) {
        ProductDaoInter pdao = Context.instanceProductDao();
        
        System.out.println(pdao.getProductById(2));
    }
}
