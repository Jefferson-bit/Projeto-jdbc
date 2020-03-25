/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.Dao.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;


public class Program {


    public static void main(String[] args) {

        
        SellerDao sellerDao = DaoFactory.createSellerDao();   
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
    
}
