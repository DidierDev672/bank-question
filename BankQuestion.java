import java.util.List;
import java.util.UUID;

public class BankQuestion {
    private UUID id;
    private List<Question> questions;

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public List<Question> getQuestion(){
        return questions;
    }

    public void setQuestion(List<Question> questions){
        this.questions = questions;
    }
}
