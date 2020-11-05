package crud.firstCRUD.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {
    // attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String email;
    private String password;

    //constructors
    public UserModel () {}

    public UserModel (Long ID, String email, String password) {
        this.ID = ID;
        this.email = email;
        this.password = password;
    }

    // getters
    public Long getID () {
        return this.ID;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPassword () {
        return this.password;
    }

    //setters
    public void setID (Long ID) {this.ID = ID;}

    public void setEmail (String email) {this.email = email;}

    public void setPassword (String password) {this.password = password;}
}
