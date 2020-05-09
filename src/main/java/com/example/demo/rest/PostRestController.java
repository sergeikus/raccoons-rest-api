package com.example.demo.rest;

import com.example.demo.model.Post;
import com.example.demo.services.PostService;
import com.example.demo.util.TestData;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostRestController {

    private final PostService postService;

    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("api/get-posts/{category}")
    public ResponseEntity getPostByCategory(@PathVariable(name = "category") String category) {
        if (category == null || category.equals("")) {
            return ResponseEntity.badRequest().body("Category is empty");
        }
        if (postService.isAvailableCategory(category)) {
            List<Post> result = postService.getPostsForCategory(category);
            return ResponseEntity.ok(new Gson().toJson(result));
        }
        return ResponseEntity.badRequest().body("Invalid category");
    }

    @PostMapping("api/init-testdata")
    public ResponseEntity initTestData() {
        List<Post> generatedPosts = TestData.generatePosts(postService.availableCategories);
        for (Post post : generatedPosts) {
            postService.addPost(post);
        }
        return ResponseEntity.ok("OK");
    }
}
