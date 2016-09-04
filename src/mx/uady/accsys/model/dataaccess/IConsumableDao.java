package mx.uady.accsys.model.dataaccess;

import mx.uady.accsys.model.bo.Consumable;

import java.util.List;

/**
 * Created by cesar on 03/09/16.
 */
public interface IConsumableDao {
    public List<Consumable> getAllConsumables();
    public Consumable getConsumable(int id);
    public void updateConsumable(Consumable consumable);
    public void deleteConsumable(Consumable consumable);
    public void addConsumable(Consumable consumable);
}
