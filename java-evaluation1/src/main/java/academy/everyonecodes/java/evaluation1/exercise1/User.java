package academy.everyonecodes.java.evaluation1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation1
 * @created 16.06.2020 - 10:01
 */
public class User {

    private String email;
    private String password;
    private List<Comment> comments;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(comment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email) &&
                Objects.equals(comments, user.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, comments);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }
}
