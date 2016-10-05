package data.dao;

import data.db.Row;
import data.db.Table;
import data.db.Tuple;
import business.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 20/09/16.
 */
public class UserDao implements Dao<User> {
    private Table userTable;

    public UserDao(){
        userTable = new Table("user");
    }

    @Override
    public int create(User user) {
        List<Tuple> userTuples = new ArrayList<>();
        userTuples.add(new Tuple<String>("username",user.getUsername()));
        userTuples.add(new Tuple<String>("password",user.getPassword()));
        userTuples.add(new Tuple<Integer>("permission_lvl",user.getPermissionLvl()));

        return userTable.addRow(userTuples);
    }

    @Override
    public User read(int id) {
        Row row = userTable.getRow(id);
        User user = new User();
        for (Tuple tup: row.getRow()){
            if (tup.getKey().equals("id")){
                user.setId((Integer) tup.getValue());
            }else if(tup.getKey().equals("username")){
                user.setUsername((String) tup.getValue());
            }else if(tup.getKey().equals("password")){
                user.setPassword((String) tup.getValue());
            }else if(tup.getKey().equals("permission_lvl")){
                user.setPermissionLvl((int)(long) tup.getValue());
            }
        }
        return user;
    }

    @Override
    public List<User> readAll() {
        List<Row> rows = userTable.getAllRows();
        List<User> users = new ArrayList<>();
        for (Row row: rows){
            User user = new User();
            for (Tuple tup: row.getRow()){
                if (tup.getKey().equals("id")){
                    user.setId((Integer) tup.getValue());
                }else if(tup.getKey().equals("username")){
                    user.setUsername((String) tup.getValue());
                }else if(tup.getKey().equals("password")){
                    user.setPassword((String) tup.getValue());
                }else if(tup.getKey().equals("permission_lvl")){
                    user.setPermissionLvl((int)(long) tup.getValue());
                }
            }
            users.add(user);
        }
        return users;
    }

    @Override
    public int update(int index, User user) {
        return 0;
    }

    @Override
    public int delete(int user) {
        return -1;
    }

}
