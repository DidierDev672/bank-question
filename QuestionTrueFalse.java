public class QuestionTrueFalse extends Question{
    private boolean answer;


    //! Getters y Setters
    public boolean getAnswer(){
        return answer;
    }

    public void setAnswer(boolean answer){
        this.answer = answer;
    }

    @Override
    public String getType(){
        return "True_False";
    }
    
}
