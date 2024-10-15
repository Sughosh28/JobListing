package com.SughoshAthreya.JobListing.Service;

import com.SughoshAthreya.JobListing.Model.Post;
import com.SughoshAthreya.JobListing.Repository.PostRepo;
import com.SughoshAthreya.JobListing.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepo repo;

    @Autowired
    private SearchRepository searchRepo;

    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    public Post createPosts(Post post) {
        return repo.save(post);
    }

    public List<Post> searchPosts(String text) {
        return searchRepo.findByText(text);
    }
}
