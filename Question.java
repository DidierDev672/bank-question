import java.util.UUID;

public abstract class Question {
    private UUID id;
    private String textQuestion;
    private String category;

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public String getTextQuestion(){
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion){
        this.textQuestion = textQuestion;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String catogory){
        this.category = catogory;
    }

    public abstract String getType();
}