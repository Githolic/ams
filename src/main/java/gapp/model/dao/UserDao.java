package gapp.model.dao;

import java.util.List;


import gapp.model.User;

public interface UserDao {

    User getUser( Integer id );

    List<User> getUsers();
    
    User getUser( String username);
    
    User getUserByEmail( String email);

}