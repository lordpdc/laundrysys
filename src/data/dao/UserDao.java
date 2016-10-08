package data.dao;

import business.entities.User;

/**
 * Created by cesar on 20/09/16.
 */
public class UserDao extends GenericDao<User> implements Dao<User> {
    private static final String entityClassName = "business.entities.User";
    private static final String tableName = "user";

    public UserDao(){
        super(entityClassName,tableName);
    }

}
