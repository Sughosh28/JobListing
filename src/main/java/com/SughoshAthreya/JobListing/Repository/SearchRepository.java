package com.SughoshAthreya.JobListing.Repository;

import com.SughoshAthreya.JobListing.Model.Post;
import org.springframework.stereotype.Component;

import java.util.List;


public interface SearchRepository {

    List<Post> findByText(String text);



}
