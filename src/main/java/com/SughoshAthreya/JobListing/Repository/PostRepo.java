package com.SughoshAthreya.JobListing.Repository;

import com.SughoshAthreya.JobListing.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends MongoRepository<Post, String > {

}
