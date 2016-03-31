package gapp.model.dao.jpa;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gapp.model.User;
import gapp.model.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUser( Integer id )
    {
        return entityManager.find( User.class, id );
    }

    @Override
    public List<User> getUsers()
    {
        return entityManager.createQuery( "from User order by id", User.class )
            .getResultList();
    }

	@Override
	public User getUser( String username) {
		User user = null;
    	List<User> users = getUsers();
    	for(int i = 0; i < users.size(); i++)  {
    		if(users.get(i).getUsername().equalsIgnoreCase(username))  {
    			user = users.get(i);
    			break;
    		}
    	}
		return user;
	}

}
