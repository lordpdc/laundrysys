/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import business.entities.Consumable;
import business.entities.Customer;
import data.db.Row;
import data.db.Table;
import data.db.Tuple;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class CustomerDao extends GenericDao<Customer>{
    private Table customerTable;
    
    
    public CustomerDao(){
        super("","");
        customerTable = new Table("customer");
    }
    
}
