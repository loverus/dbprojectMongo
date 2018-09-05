package com.db.dbproject;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String email;
    private String password;
    private List<User> users;

    protected Admin(){this.users = new ArrayList<>();
    }

    public Admin(String email, String password, List<User> users) {
        this.email = email;
        this.password = password;
        this.users = users;
    }

    public String getId() {
        return id;
    }

   /* public void setId(String id) {
        this.id = id;
    }*/

    public String getEmail() {
        return email;
    }

    /*public void setEmail(String email) {
        this.email = email;
    }
*/
    public String getPassword() {
        return password;
    }

  /*  public void setPassword(String password) {
        this.password = password;
    }
*/
    public List<User> getUsers() {
        return users;
    }

  /*  public void setUsers(List<User> users) {
        this.users = users;
    }
*/

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
