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
      
        User.Builder builder = new User.Builder();
        builder.setId(1).setName("Shan").setEmail("shan@gmail.com").setPassword("123").setCity("Colombo");
        
        User user = builder.build();
        System.out.println(user);
        
    }
    
}
class User{

    private int id;
    private String name;
    private String email;
    private String password;
    private String city;

    public User(Builder userBuilder) {
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
    
    static class Builder{

    private int id;
    private String name;
    private String email;
    private String password;
    private String city;
    
    public User build(){
        User u = new User(this);
        return u;
    }
    
    public Builder setId(int id) {
        this.id = id;
        return this;
    }

   
    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    
    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    
    public Builder setCity(String city) {
        this.city = city;
        return this;
    }
    
    
    
}
    
}

 
