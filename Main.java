import java.util.List;

public class Main {
    public static void main(String[] args){
        //! Crear una pregunta multiple
        MultipleQuestion multipleQuestion = new MultipleQuestion();
        multipleQuestion.setTextQuestion("Cual es la capital de Francia?");
        multipleQuestion.setCategory("Geografía");
        multipleQuestion.setOptions(List.of("Paris", "Londres", "Berlin"));
        multipleQuestion.setAnswer(List.of("Paris"));


        //! Crear una pregunta verdadero/falso
        QuestionTrueFalse false1 = new QuestionTrueFalse();
        false1.setTextQuestion("La tierra es plana");
        false1.setCategory("Ciencia");
        false1.setAnswer(false);

        //! Crear un Banco de preguntas
        BankQuestion bankQuestion = new BankQuestion();
        bankQuestion.setQuestion(List.of(multipleQuestion, false1));

        //! Imprimir preguntas del banco
        for (Question question : bankQuestion.getQuestion()){
            System.out.println("Question: " + question.getTextQuestion());
            System.out.println("Category: " + question.getCategory());
            System.out.println("Type: " + question.getType());
        }
    }
}
