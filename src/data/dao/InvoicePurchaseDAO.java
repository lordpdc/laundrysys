package data.dao;

<<<<<<< HEAD
import business.entities.InvoicePurchase;
=======
import business.entities.PurchaseInvoice;
>>>>>>> Pinkus96-upload-1

/**
 * Created by raoman on 02/10/2016.
 */
<<<<<<< HEAD
public class InvoicePurchaseDAO extends GenericDao<InvoicePurchase>{
=======
public class InvoicePurchaseDAO extends GenericDao<PurchaseInvoice>{
>>>>>>> Pinkus96-upload-1
    private static final String entityClassName = "business.entities.InvoicePurchaseViews";
    private static final String tableName = "invoicepurchasetable";

    public InvoicePurchaseDAO(){
        super(entityClassName,tableName);
    }
}
