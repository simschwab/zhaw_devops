package Spark.Java;

import java.util.Collection;

import javax.servlet.UnavailableException;

public interface UserService {
  
    public static void addUser (User user) {
        // TODO Auto-generated method stub
        
    }
    
    public static Collection<User> getUsers () {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static User getUser (String id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static User editUser (User user) 
     throws UnavailableException {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void deleteUser (String id) {
        // TODO Auto-generated method stub
        
    }
    
    public static boolean userExist (String id) {
        // TODO Auto-generated method stub
        return false;
    }
}
