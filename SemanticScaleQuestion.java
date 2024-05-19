import java.util.List;

public class SemanticScaleQuestion extends Question{

    private List<String> scales;

    private int answer;

    //! Getters y Setters
    public List<String> getScales(){
        return scales;
    }

    public void setScales(List<String> scales){
        this.scales = scales;
    }

    public int getAnswer(){
        return answer;
    }

    public void setAnswer(int answer){
        this.answer = answer;
    }

    @Override
    public String getType() {
        return "SemanticDifferentialScale";
    }
    
}
