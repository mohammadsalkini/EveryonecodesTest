package academy.everyonecodes.java.evaluation1.exercise1;

import java.util.Objects;

/**
 * @author Mohammad Alsalkini
 * @project javaEvaluation1
 * @created 16.06.2020 - 10:05
 */
public class Comment {

    private String title;
    private String content;
    private String author;

    public Comment(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(title, comment.title) &&
                Objects.equals(content, comment.content) &&
                Objects.equals(author, comment.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, author);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
