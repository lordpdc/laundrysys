package business.administrator;

<<<<<<< HEAD
import business.entities.InvoicePurchase;
=======
import business.entities.PurchaseInvoice;
>>>>>>> Pinkus96-upload-1
import data.dao.InvoicePurchaseDAO;

import java.util.List;

/**
 * Created by raoman on 09/10/2016.
 */
public class AdministratoInvoicePurchase {
    InvoicePurchaseDAO invoicePurchaseDAO;

    public AdministratoInvoicePurchase() {
        this.invoicePurchaseDAO = new InvoicePurchaseDAO();
    }

<<<<<<< HEAD
    public void addNew(InvoicePurchase invoice){
=======
    public void addNew(PurchaseInvoice invoice){
>>>>>>> Pinkus96-upload-1
        invoicePurchaseDAO.create(invoice);
    }

    public void remove(int id){
        invoicePurchaseDAO.delete(id);
    }

<<<<<<< HEAD
    public InvoicePurchase search(int id){
        return invoicePurchaseDAO.read(id);
    }

    public List<InvoicePurchase> seeAll(){
=======
    public PurchaseInvoice search(int id){
        return invoicePurchaseDAO.read(id);
    }

    public List<PurchaseInvoice> seeAll(){
>>>>>>> Pinkus96-upload-1
        return invoicePurchaseDAO.readAll();
    }

}
