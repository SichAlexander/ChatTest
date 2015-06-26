package com.example.Alex.myapplication.backend.dstore;


import com.example.Alex.myapplication.backend.models.User;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

import java.util.ArrayList;

/**
 * Created by Alex on 26.06.2015.
 */
public class DataStoreHelper {

    private static DatastoreService datastore;

    private static ArrayList<User> authors = new ArrayList<>();

    private static User generateUser(Entity _result){
        User user = new User();

        long id = _result.getKey().getId();
        user.setId(id);

        String userName = (String) _result.getProperty(Field.USER_NAME);
        user.setUsername(userName);

        String regId = (String) _result.getProperty(Field.REG_ID);
        user.setRegId(regId);

        String imageUrl = (String) _result.getProperty(Field.USER_IMAGE);
        user.setRegId(imageUrl);

        return user;
    }

    private static ArrayList<User> getUsers(String _name){

        if (datastore == null) {
            datastore = DatastoreServiceFactory.getDatastoreService();
        }

        Query.Filter byLastUpdate = new Query.FilterPredicate(Field.USER_NAME,
                Query.FilterOperator.EQUAL,
                _name);

        Query q = new Query(Field.USER).setFilter(byLastUpdate);

        ArrayList<User> users = new ArrayList<>();
        PreparedQuery pq = datastore.prepare(q);
        for (Entity result : pq.asIterable()) {
            User user = generateUser(result);
            users.add(user);
        }
        return users;
    }

}
