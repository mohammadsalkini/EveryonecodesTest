package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mohammad Alsalkini
 * @project java-evaluation1
 * @created 16.06.2020 - 10:44
 */
class AuthorEmailRetrieverTest {

    @Test
    @DisplayName("Test with an existing value")
    void retrieveMethodTest() {
        Comment comment1 = new Comment("comment1title", "comment1content", "comment1author");
        Assertions.assertEquals(Optional.of("user1@user.user"), AuthorEmailRetriever.retrieve(comment1));

    }

    @Test
    @DisplayName("Test with dummy value")
    void retrieveMethodTest2() {
        Comment comment1 = new Comment("comment6title", "comment6content", "comment6author");
        Assertions.assertEquals(Optional.empty(), AuthorEmailRetriever.retrieve(comment1));

    }

    @Test
    @DisplayName("Test with an existing value")
    void retrieveMethodTest3() {
        Comment comment1 = new Comment("comment3title", "comment3content", "comment3author");
        Assertions.assertEquals(Optional.of("user3@user.user"), AuthorEmailRetriever.retrieve(comment1));

    }
}