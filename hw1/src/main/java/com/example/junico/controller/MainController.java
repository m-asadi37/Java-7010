package com.example.junico.controller;

import com.example.junico.MainApplication;
import com.example.junico.model.Post;
import com.example.junico.model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    private VBox postsContainer;

    @FXML
    private TextArea postTextArea;

    private final List<Post> posts = new ArrayList<>();

    // fake logged in user
    private final User currentUser = new User("mohammad", "09120000000", "test@gmail.com");

    @FXML
    public void initialize() {
        // sample post
        Post sample = new Post(currentUser, "Hello JavaFX!");
        posts.add(sample);
        refreshPosts();
    }

    @FXML
    public void publishPost() {
        String content = postTextArea.getText();
        if (content == null || content.isBlank()) {
            return;
        }
        Post post = new Post(currentUser, content);
        posts.add(0, post);
        postTextArea.clear();
        refreshPosts();
    }

    private void refreshPosts() {
        postsContainer.getChildren().clear();
        for (Post post : posts) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/junico/view/post-item.fxml"));
                VBox postNode = loader.load();
                PostItemController controller = loader.getController();
                controller.setPost(post);
                postsContainer.getChildren().add(postNode);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}