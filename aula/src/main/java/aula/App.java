package aula;

import com.google.gson.Gson;

import aula.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User("Lonan", 18, 5000.00);
        
        String json = "";

        Gson gson = new Gson();
        
        json = gson.toJson(user);
        
        System.out.println(json);
        
        User userFromJson = gson.fromJson(json, User.class);
        
        System.out.println(userFromJson.getName());
        System.out.println(userFromJson.getAge());
        System.out.println(userFromJson.getSalary());
    }
}
