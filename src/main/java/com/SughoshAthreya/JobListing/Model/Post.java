package com.SughoshAthreya.JobListing.Model;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private String exp;
    private String techs[];

    public Post() {
    }

    public Post(String profile, String desc, String exp, String[] techs) {
        this.profile = profile;
        this.desc = desc;
        this.exp = exp;
        this.techs = techs;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] gettechs() {
        return techs;
    }

    public void settechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
