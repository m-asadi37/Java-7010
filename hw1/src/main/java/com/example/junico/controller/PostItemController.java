package com.example.junico.controller;

import com.example.junico.model.Post;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PostItemController {

    @FXML
    private Label creatorLabel;

    @FXML
    private Label contentLabel;

    @FXML
    private Label likesLabel;

    private Post post;

    public void setPost(Post post) {
        this.post = post;
        creatorLabel.setText(post.getCreator().getUsername());
        contentLabel.setText(post.getContent());
        likesLabel.setText("Likes: " + post.getLikes());
    }

    @FXML
    public void likePost() {
        post.setLikes(post.getLikes() + 1);
        likesLabel.setText("Likes: " + post.getLikes());
    }
}