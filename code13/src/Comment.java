import java.time.LocalDateTime;

public class Comment {

    private static long COUNTER = 0;

    private long id;
    private User creator;
    private String content;
    private final LocalDateTime time;

    public Comment(User creator, String content) {
        this.id = ++COUNTER;
        this.creator = creator;
        this.content = content;
        this.time = LocalDateTime.now();
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;
        return id == comment.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "Comment{creator=%s, content='%s', time=%s}"
                .formatted(creator, content, time);
    }
}
