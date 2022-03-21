package Spark.Java;

import java.util.Collection;

import javax.servlet.UnavailableException;

public interface UserService {
  
    public void addUser (User user);
    
    public Collection<User> getUsers ();
    
    public User getUser (String id);
    
    public User editUser (User user) 
     throws UnavailableException;
    
    public void deleteUser (String id);
    
    public boolean userExist (String id);
}
