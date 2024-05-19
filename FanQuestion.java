import java.util.List;

public class FanQuestion extends Question{
    private List<String> options;
    
    private String answer;


    //! Getters y Setters
    public List<String> getOptions(){
        return options;
    }

    public void setOptions(List<String> options){
        this.options = options;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    @Override
    public String getType() {
        return "Fan";
    }
}
