package mx.uady.accsys.model.dao;

import mx.uady.accsys.model.bo.Consumable;

import java.util.List;

/**
 * Created by cesar on 03/09/16.
 */
public interface IConsumableDao {
    public List<Consumable> getAllConsumables();
    public Consumable getConsumable(int id);
    public Consumable getConsumable(String name);
    public void updateConsumable(Consumable consumable);
    public void deleteConsumable(Consumable consumable);
    public int addConsumable(Consumable consumable);
}
