package mx.uady.accsys;

import mx.uady.accsys.model.bo.Consumable;
import mx.uady.accsys.model.dao.ConsumableDao;

/**
 * Created by cesar on 03/09/16.
 */
public class Main {

    public static void main(String[] args) {

        // Testing some stuff out

        String nombre = "detergente burbujita";
        String description = "lava la ropa y la hace mas bonita";
        Consumable detergent = new Consumable(nombre,description);

        ConsumableDao consumableDao = new ConsumableDao();
        consumableDao.addConsumable(detergent);

    }

}