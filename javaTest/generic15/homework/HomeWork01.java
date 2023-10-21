package com.javaTest.generic15.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class HomeWork01 {
    public static void main(String[] args) {
//        DAO<User> userDAO = new DAO<>();
//        userDAO.save("tom", new User(1, 18, "tom"));
//        userDAO.save("john", new User(3, 20, "john"));
//        userDAO.save("jack", new User(2, 19, "jack"));
//        userDAO.save("simith", new User(4, 21, "simith"));
//
//        System.out.println(userDAO.list());

    }
    @Test
    public void testList(){
        DAO<User> userDAO = new DAO<>();
        userDAO.save("tom", new User(1, 18, "tom"));
        userDAO.save("john", new User(2, 20, "john"));
        userDAO.save("jack", new User(3, 19, "jack"));
        userDAO.save("simith", new User(4, 21, "simith"));

        List<User> list = userDAO.list();
        System.out.println(list);

        userDAO.update("tom", new User(1,25, "james"));
        System.out.println(userDAO.list());

        userDAO.delete("jack");
        System.out.println(userDAO.list());

        System.out.println("\nid=simith" + userDAO.get("simith"));
    }
}

class DAO<T> {
    Map<String, T> map = new HashMap<>();

    /*public DAO(Map<String, T> map) {
        this.map = map;
    }

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }*/

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);

    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {

        List<T> list = new ArrayList<>();

        Set<String> keySet = map.keySet();
        for (String key: keySet){
            list.add(map.get(key)); //也可以用本类的 get（String id）
        }

        /*Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> str = iterator.next();
            System.out.println(str + "-" + map.get(str));

        }*/
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}