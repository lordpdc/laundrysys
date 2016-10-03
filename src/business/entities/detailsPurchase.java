package business.entities;

/**
 * Created by raoman on 01/10/2016.
 */
public class detailsPurchase {
    private int id;
    private int idInvoicePurchase;
    private int idConsumable;
    private double priceConsumable;
    private double quantityConsumable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInvoicePurchase() {
        return idInvoicePurchase;
    }

    public void setIdInvoicePurchase(int idInvoicePurchase) {
        this.idInvoicePurchase = idInvoicePurchase;
    }

    public int getIdConsumable() {
        return idConsumable;
    }

    public void setIdConsumable(int idConsumable) {
        this.idConsumable = idConsumable;
    }

    public double getPriceConsumable() {
        return priceConsumable;
    }

    public void setPriceConsumable(double priceConsumable) {
        this.priceConsumable = priceConsumable;
    }

    public double getQuantityConsumable() {
        return quantityConsumable;
    }

    public void setQuantityConsumable(double quantityConsumable) {
        this.quantityConsumable = quantityConsumable;
    }
}
