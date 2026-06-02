public class Application {

    public static void main(String[] args) {
        User u1 = new User("user1", "09876543211", "example@email.com");
        User u2 = new User("user2", "09876543222", "example2@email.com");

        Post p1 = new Post(u1, "salam internet azad shod!");

        Comment c1 = new Comment(u2, "be salamati!");

        p1.getCommentList().add(c1);

        System.out.println(p1);
        System.out.println(c1);
    }
}
