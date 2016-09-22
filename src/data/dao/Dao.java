package data.dao;

import java.util.List;

/**
 * Created by cesar on 20/09/16.
 */
public interface Dao<T, PK> {
    int create(T t);
    T read(PK id);
    List<T> readAll();
    int update(T t);
    void delete(T t);
}
