package business.administrator;

import business.entities.InvoicePurchase;
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

    public void addNew(InvoicePurchase invoice){
        invoicePurchaseDAO.create(invoice);
    }

    public void remove(int id){
        invoicePurchaseDAO.delete(id);
    }

    public InvoicePurchase search(int id){
        return invoicePurchaseDAO.read(id);
    }

    public List<InvoicePurchase> seeAll(){
        return invoicePurchaseDAO.readAll();
    }

}
