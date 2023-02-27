/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package az.perfect;

import az.perfect.config.Context;
import az.perfect.dao.inter.ProductDaoInter;
import az.perfect.dao.inter.StoreDaoInter;

/**
 *
 * @author Perfect
 */
public class TechnoStoreWithJDBC {

    public static void main(String[] args) {
        StoreDaoInter sdao = Context.instanceStoreDao();
        
        System.out.println(sdao.getStoreById(2));
    }
}
