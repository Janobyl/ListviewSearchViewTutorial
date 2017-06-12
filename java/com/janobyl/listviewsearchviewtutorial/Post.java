package com.janobyl.listviewsearchviewtutorial;

/**
 * Created by Abdul Jamil on 6/12/2017.
 */

public class Post {
    private String postTitle;

    private String postSubTitle;

    public Post(String postTitle, String postSubTitle) {
        this.postTitle = postTitle;
        this.postSubTitle = postSubTitle;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostSubTitle() {
        return postSubTitle;
    }

    public void setPostSubTitle(String postSubTitle) {
        this.postSubTitle = postSubTitle;
    }
}

