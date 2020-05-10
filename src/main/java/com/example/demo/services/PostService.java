package com.example.demo.services;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;

// This service will be connected to the repository interface
// for DB interactions
@Service
public class PostService {

    public final HashMap<String, Integer> availableCategories = new HashMap<String, Integer>() {
        {
            put("software", 0);
            put("electronics", 0);
            put("teachers&students", 0);
            put("economics", 0);
            put("arts&crafts", 0);
            put("random", 0);
        }
    };

    private List<Post> posts = new ArrayList<>();

    public boolean isAvailableCategory(String category) {
        if (category == null || category.equals("")) {
            return false;
        }
        return availableCategories.containsKey(category);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPostsForCategory(String category) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getCategory().equals(category.toLowerCase())) {
                result.add(post);
            }
        }
        return result;
    }

    public void clearPosts() {
        posts = new ArrayList<>();
    }

}
