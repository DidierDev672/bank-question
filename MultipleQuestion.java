import java.util.List;

public class MultipleQuestion extends Question {
    private List<String> options;
    private List<String> answers;


    //! Getters y Setters
    public List<String> getOpstions(){
        return options;
    }

    public void setOptions(List<String> options){
        this.options = options;
    }

    public List<String> getAnswer(){
        return answers;
    }

    public void setAnswer(List<String> answers){
        this.answers = answers;
    }

    @Override
    public String getType(){
        return "Multiple Choice";
    }
}
