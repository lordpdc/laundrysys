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
public class CustomerDao implements Dao<Customer,Integer>{
    private Table customerTable;
    
    
    public CustomerDao(){
        customerTable = new Table("customer");
    }
    
    @Override
    public int create(Customer customer) {
        List<Tuple> customerTuple = new ArrayList<>();
        customerTuple.add(new Tuple<String,String>(DaoElements.name,customer.getName()));
        customerTuple.add(new Tuple<String,String>(DaoElements.phone,customer.getPhone()));
        customerTuple.add(new Tuple<String,String>(DaoElements.mail,customer.getMail()));

        return customerTable.addRow(customerTuple);
    }

    @Override
    public Customer read(Integer id) {
        Row row = customerTable.getRow(id);
        Customer customer = new Customer();

        for (Tuple tup: row.getTuples()){
            switch(tup.getKey().toString()){
                case DaoElements.id:
                    customer.setId((Integer) tup.getValue());
                    break;
                case DaoElements.name:
                    customer.setName((String) tup.getValue());
                    break;
                case DaoElements.phone:
                    customer.setPhone((String) tup.getValue());
                    break;
                case DaoElements.mail:
                    customer.setMail((String) tup.getValue());
                    break;
                default:
                    
            }
        }

        return customer;
    }

    @Override
    public List<Customer> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
