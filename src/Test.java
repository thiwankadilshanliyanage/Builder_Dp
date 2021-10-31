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

    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final String city;

    public User(Builder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.password = userBuilder.password;
        this.city = userBuilder.city;
    }
  
   
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
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

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        Builder() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    
    
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

 
