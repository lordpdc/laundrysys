/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

/**
 *
 * @author Luis
 */
public class CustomerAdministrator extends Administrator {

    public CustomerAdministrator(){
        element = new CustomerDao();
    }

    @Override
    public void create(Object entiti) {
        element.create(entiti);
    }

    @Override
    public void delete(Object entiti) {
        element.delete(entiti);
    }

    @Override
    public void update(Object entiti) {
        element.update(entiti);
    }

    @Override
    public void read(int id) {
        element.read(id);
    }

    @Override
    public void readAll() {
        element.readAll();
    }
    
    

    
}
