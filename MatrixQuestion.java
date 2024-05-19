import java.util.List;

public class MatrixQuestion extends Question {

    private List<String> rows;
    private List<String> columns;
    private List<String> answer;

    //! Getters y Setters
    public List<String> getRows(){
        return rows;
    }

    public void setRows(List<String> rows){
        this.rows = rows;
    }

    public List<String> getColumns(){
        return columns;
    }

    public void setColumns(List<String> columns){
        this.columns = columns;
    }

    public List<String> getAnswer(){
        return answer;
    }

    public void setAnswer(List<String> answer){
        this.answer = answer;
    }
    
    @Override
    public String getType() {
        return "Matrix";
    }
    
}
