package data.dao;

import business.entities.InvoicePurchase;

/**
 * Created by raoman on 02/10/2016.
 */
public class InvoicePurchaseDAO extends GenericDao<InvoicePurchase>{
    private static final String entityClassName = "business.entities.InvoicePurchaseViews";
    private static final String tableName = "invoicepurchasetable";

    public InvoicePurchaseDAO(){
        super(entityClassName,tableName);
    }
}
