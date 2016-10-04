/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.dao;

import business.entities.Customer;
import business.entities.Supplier;
import data.db.Row;
import data.db.Table;
import data.db.Tuple;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class SupplierDao implements Dao<Supplier,Integer>{
    private Table supplierTable;
    
    public SupplierDao(){
        supplierTable = new Table("supplier");
    }
    
    
    @Override
    public int create(Supplier supplier) {
        List<Tuple> supplierTuple = new ArrayList<>();
        supplierTuple.add(new Tuple<String,String>(DaoElements.name,supplier.getName()));
        supplierTuple.add(new Tuple<String,String>(DaoElements.address,supplier.getAddress()));
        supplierTuple.add(new Tuple<String,String>(DaoElements.phone,supplier.getPhone()));
        supplierTuple.add(new Tuple<String,String>(DaoElements.mail,supplier.getMail()));

        return supplierTable.addRow(supplierTuple);
    }

    @Override
    public Supplier read(Integer id) {
        Row row = supplierTable.getRow(id);
        Supplier supplier = new Supplier();

        for (Tuple tup: row.getTuples()){
            switch(tup.getKey().toString()){
                case DaoElements.id:
                    supplier.setId((Integer) tup.getValue());
                    break;
                case DaoElements.name:
                    supplier.setName((String) tup.getValue());
                    break;
                case DaoElements.address:
                    supplier.setAddress((String) tup.getValue());
                    break;
                case DaoElements.phone:
                    supplier.setPhone((String) tup.getValue());
                    break;
                case DaoElements.mail:
                    supplier.setMail((String) tup.getValue());
                    break;
                default:
                    
            }
        }

        return supplier;
    }

    @Override
    public List<Supplier> readAll() {
        List<Row> rows = supplierTable.getAllRows();
        List<Supplier> suppliers = new ArrayList<>();

        for(Row row: rows){
            Supplier supplier = new Supplier();
            for (Tuple tup: row.getTuples()){
                switch(tup.getKey().toString()){
                    case DaoElements.id:
                        supplier.setId((Integer) tup.getValue());
                        break;
                    case DaoElements.name:
                        supplier.setName((String) tup.getValue());
                        break;
                    case DaoElements.address:
                        supplier.setAddress((String) tup.getValue());
                        break;
                    case DaoElements.phone:
                        supplier.setPhone((String) tup.getValue());
                        break;
                    case DaoElements.mail:
                        supplier.setMail((String) tup.getValue());
                        break;
                    default:
                }
            }
            suppliers.add(supplier);
        }

        return suppliers;
    }

    @Override
    public int update(Supplier supplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Supplier supplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
