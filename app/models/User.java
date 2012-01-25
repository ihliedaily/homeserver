package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @author ihle
 */
@Entity
class User extends Model {
    
    public String firstname;
    public String lastname;
    public String username;
    public String password;
    public String email;

    public User(String firstname, String lastname, String username, String password, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}