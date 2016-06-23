package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.quizzes.Quiz;

import java.io.IOException;
import java.util.Optional;

public interface QuizWriter extends CanvasWriter<Quiz, QuizWriter> {
    /**
     *
     * @param quiz The quiz to update
     * @param courseId The course ID in which the quiz lives
     * @return The updated Quiz object
     * @throws IOException When there is an error communicating with Canvas
     */
    Optional<Quiz> updateQuiz(Quiz quiz, String courseId) throws IOException;
}
