package com.SughoshAthreya.JobListing.Controller;
import com.SughoshAthreya.JobListing.Model.Post;
import com.SughoshAthreya.JobListing.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JobPostController {

    @Autowired
    private PostService service;

    @GetMapping("/jobPosts")
    @CrossOrigin
    public List<Post> getAllPosts() {
    return service.getAllPosts();
    }

    @GetMapping("/search/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {
    return service.searchPosts(text);
    }

    @PostMapping("/createJobPost")
    @CrossOrigin
    public Post createPosts(@RequestBody Post post) {
    return service.createPosts(post);
    }
}
