package models;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import play.db.jpa.Model;

/**
 *
 * @author ihle
 */
@Entity
public class BlogPost extends Model {
    
    public String title;
    
    @Lob
    public String body;
    
    @ManyToOne
    public User user;
    public Date created;
    public Date edited;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    public List<Picture> pictures;

    public BlogPost(String title, String body, User user, Date created, Date edited, List<Picture> pictures) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.created = created;
        this.edited = edited;
        this.pictures = pictures;
    }
    
}
