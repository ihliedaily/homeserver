package controllers;

import java.util.Date;
import models.BlogPost;
import play.Play;
import play.mvc.Before;
import play.mvc.Controller;

public class Post extends Controller {

    @Before
    static void addDefaults() {
        renderArgs.put("blogTitle", Play.configuration.getProperty("blog.title"));
    }
    
    public static void index() {
        render();
    }
    
    public static void addPost() {
        render();
    }
    
    public static void savePost(String title, String body, String created) {
        BlogPost post = new BlogPost(title, body, null, new Date(System.currentTimeMillis()), null, null);
        post.save();
        Application.index();
    }

}