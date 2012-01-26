package controllers;

import java.util.List;
import models.BlogPost;
import play.Play;
import play.mvc.Before;
import play.mvc.Controller;

public class Application extends Controller {

    @Before
    static void addDefaults() {
        renderArgs.put("blogTitle", Play.configuration.getProperty("blog.title"));
    }

    public static void index() {
        List<BlogPost> posts = BlogPost.findAll();
        render(posts);
    }
}