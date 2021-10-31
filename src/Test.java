/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class Test {

   
    public static void main(String[] args) {
      
//        User u = new User(1,"Shan","shan@gmail.com","123","Colombo");
//        System.out.println(u);

        User.UserBuilder b = new User.UserBuilder();
        b.setId(1);
        
        User u = b.build();
        System.out.println(u);
    }
    
}
class User{

    private int id;
    private String name;
    private String email;
    private String password;
    private String city;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.city = userBuilder.city;
    }
  
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
      String output = "ID : " + getId() + " \n "
              + " Name : " + getName() + " \n "
              + " Email : " + getEmail() + " \n "
              + " Password : " + getPassword()+ " \n "
              + " City : " + getCity()+ "  ";
        return output;
    }
    
    static class UserBuilder{

    private int id;
    private String name;
    private String email;
    private String password;
    private String city;
    
    public User build(){
        User u = new User(this);
        return u;
    }
    
    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

   
    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    
    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    
    
    
}
    
}

 
