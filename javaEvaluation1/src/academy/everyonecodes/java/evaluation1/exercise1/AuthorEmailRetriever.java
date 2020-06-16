package academy.everyonecodes.java.evaluation1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation1
 * @created 16.06.2020 - 10:10
 */
public class AuthorEmailRetriever {

    private static List<User> users = new ArrayList<>();

    static {
        User user1 = new User("user1@user.user", "user1password");
        user1.addComment(new Comment("comment1title", "comment1content", "comment1author"));
        User user2 = new User("user2@user.user", "user2password");
        user2.addComment(new Comment("comment2title", "comment2content", "comment2author"));
        User user3 = new User("user3@user.user", "user3password");
        user3.addComment(new Comment("comment3title", "comment3content", "comment3author"));
        User user4 = new User("user4@user.user", "user4password");
        user4.addComment(new Comment("comment4title", "comment4content", "comment4author"));
        User user5 = new User("user5@user.user", "user5password");
        user5.addComment(new Comment("comment5title", "comment5content", "comment5author"));
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public static Optional<String> retrieve (Comment comment) {

        for (User user : users) {
            if (user.getComments() != null && user.getComments().size() != 0) {
                for (Comment userComment : user.getComments()) {
                    if (userComment == comment) {
                        return Optional.of(user.getEmail());
                    }
                }
            }
        }
        return Optional.empty();
    }
}
