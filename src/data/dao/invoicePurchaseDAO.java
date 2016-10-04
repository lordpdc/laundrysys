package data.dao;

import business.entities.invoicePurchase;
import data.db.Row;
import data.db.Table;
import data.db.Tuple;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by raoman on 02/10/2016.
 */
public class invoicePurchaseDAO implements Dao<invoicePurchase,Integer>{
    Table invoicePurchaseTable;

    public invoicePurchaseDAO(Table invoicePurchaseTable) {
        String nameTable="invoicePurchase";
        this.invoicePurchaseTable = new Table(nameTable);
    }

    @Override
    public int create(invoicePurchase invoicePurchase) {
        List<Tuple> invoicePurchaseTuple = new ArrayList<>();

        String[] attrList={"id","idSupplier","date","totalPrice"};
        invoicePurchaseTuple.add(new Tuple(attrList[0],invoicePurchase.getId()));
        invoicePurchaseTuple.add(new Tuple(attrList[1],invoicePurchase.getIdSupplier()));
        invoicePurchaseTuple.add(new Tuple(attrList[2],invoicePurchase.getDate()));
        invoicePurchaseTuple.add(new Tuple(attrList[3],invoicePurchase.getTotalPrice()));

        return invoicePurchaseTable.addRow(invoicePurchaseTuple);
    }


    @Override
    public invoicePurchase read(Integer id) {
        Row row = invoicePurchaseTable.getRow(id);
        invoicePurchase invoicePurchase = new invoicePurchase();

        for (Tuple tup: row.getTuples()){
            String key=(String) tup.getKey();
            Object value=tup.getValue();
            switch (key){
                case "id":
                    invoicePurchase.setId((Integer)value);
                    break;
                case "idSupplier":
                    invoicePurchase.setIdSupplier((Integer)value);
                    break;
                case "date":
                    invoicePurchase.setDate((Date)value);
                    break;
                case "totalPrice":
                    invoicePurchase.setTotalPrice((double)value);
                    break;
                default:
                    new Exception("error leer factura de Compra");

            }
        }

        return invoicePurchase;
    }


    @Override
    public List<invoicePurchase> readAll() {
        return null;
    }

    @Override
    public int update(invoicePurchase invoicePurchase) {
        return 0;
    }

    @Override
    public void delete(invoicePurchase invoicePurchase) {

    }
}
