public class OpenQuestion extends Question{
    
    private String answer;

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    @Override
    public String getType() {
        return "Open";
    }
}
