/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {


    public static void main(String[] args) {

        
        SellerDao sellerDao = DaoFactory.createSellerDao();   
        
        System.out.println("=== TESTE 1: seller findbyID =====");
        Seller seller = sellerDao.findById(3);       
        System.out.println(seller);
        
        
        System.out.println("\n=== TESTE 2: seller findbyDeparmentID =====");
        Department department = new Department(2, null);    
        List<Seller> list = sellerDao.findByDeparment(department);      
        list.forEach((obj) -> {
            System.out.println(obj);
        });
        
        
        
        System.out.println("\n=== TESTE 3: seller findAll =====");
            
        list = sellerDao.findAll();      
        list.forEach((obj) -> {
            System.out.println(obj);
        });
        
        
    }
    
}
