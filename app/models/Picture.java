package models;

import javax.persistence.Entity;
import play.db.jpa.Blob;
import play.db.jpa.Model;

/**
 *
 * @author ihle
 */
@Entity
class Picture extends Model {
    
    public Blob image;
    
}
