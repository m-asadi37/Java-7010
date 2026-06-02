package com.example.junico.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static long COUNTER = 0;

    private long id;
    private User creator;
    private String content;
    private final LocalDateTime time;
    private long likes;
    private long views;
    private final List<Comment> commentList = new ArrayList<>();

    public Post(User creator, String content) {
        this.id = ++COUNTER;
        this.creator = creator;
        this.content = content;
        this.time = LocalDateTime.now();
        this.likes = 0;
        this.views = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    @Override
    public String toString() {
        return "Post{creator=%s, content='%s', time=%s}"
                .formatted(creator, content, time);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
