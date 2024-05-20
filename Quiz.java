import java.util.List;
import java.util.UUID;

public class Quiz {
    private UUID id;
    private String title;
    private Category category;
    private List<BankQuestion> questions;

    // ! Constructor
    public Quiz(UUID id, String title, Category category, List<BankQuestion> questions) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.questions = questions;
    }

    // ! Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<BankQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<BankQuestion> questions) {
        this.questions = questions;
    }
}
