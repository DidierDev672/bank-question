import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // ! Crear una pregunta multiple
        /*
         * MultipleQuestion multipleQuestion = new MultipleQuestion();
         * multipleQuestion.setTextQuestion("Cual es la capital de Francia?");
         * multipleQuestion.setSubCategory("Geografía");
         * multipleQuestion.setOptions(List.of("Paris", "Londres", "Berlin"));
         * multipleQuestion.setAnswer(List.of("Paris"));
         *
         * // ! Crear una pregunta verdadero/falso
         * QuestionTrueFalse false1 = new QuestionTrueFalse();
         * false1.setTextQuestion("La tierra es plana");
         * false1.setSubCategory("Ciencia");
         * false1.setAnswer(false);
         *
         * // ! Crear un Banco de preguntas
         * BankQuestion bankQuestion = new BankQuestion();
         * bankQuestion.setQuestion(List.of(multipleQuestion, false1));
         *
         * // ! Imprimir preguntas del banco
         * for (Question question : bankQuestion.getQuestion()) {
         * System.out.println("Question: " + question.getTextQuestion());
         * System.out.println("Category: " + question.getSubCategory());
         * System.out.println("Type: " + question.getType());
         * }
         */

        Category category = new Category(UUID.randomUUID(), "Ciencia");
        BankQuestion bankQuestion2 = new BankQuestion();

        MultipleQuestion multipleQuestion2 = new MultipleQuestion();
        multipleQuestion2.setId(UUID.randomUUID());
        multipleQuestion2.setTextQuestion("¿Cuál es el planeta más cercano al Sol?");
        multipleQuestion2.setSubCategory("Astronomía");
        multipleQuestion2.setOptions(List.of("Marte", "Tierra", "Jupiter"));
        multipleQuestion2.setAnswer(List.of("Marte"));

        // ! Matrix

        System.out.println("¿Qué tan familiarizado estás con los siguientes temas de ciencia ficción?");
        MatrixQuestion matrixQuestion = new MatrixQuestion();
        matrixQuestion
                .setRows(List.of("Dune", "Star wars", "Blade Runner", "Black Mirror"));
        matrixQuestion.setColumns(List.of("Muy Buena", "Bastante Buena", "Algo",
                "Poco", "Nada"));
        matrixQuestion.setAnswer(List.of("X", "X", "x", "X", "X"));

        System.out.println("List Rows: " + matrixQuestion.getRows());
        System.out.println("List Columns: " + matrixQuestion.getColumns());
        System.out.println("List Answer: " + matrixQuestion.getAnswer());

        FanQuestion fanQuestion = new FanQuestion();
        fanQuestion.setAnnouncer(
                "¡Bienvenido al quiz de los fans! ¿Estás listo para poner a prueba tus conocimientos sobre tus cosas favoritas?");
        fanQuestion.setOptions(List.of("¡Claro que sí! Soy un verdadero fan.",
                "Creo que sé mucho, pero siempre estoy aprendiendo más.",
                "No estoy seguro, pero estoy dispuesto a intentarlo."));
        fanQuestion.setAnswer("Creo que sé mucho, pero siempre estoy aprendiendo más.");

        System.out.println("Question: " + fanQuestion.getAnnouncer());
        System.out.println("Options: " + fanQuestion.getOptions());
        System.out.println("Answer: " + fanQuestion.getAnswer());

        QuestionTrueFalse false2 = new QuestionTrueFalse();
        false2.setId(UUID.randomUUID());
        false2.setTextQuestion("La gravedad en la Tierra es de 9.8 m/s²");
        false2.setSubCategory("Física");
        false2.setAnswer(false);

        bankQuestion2.setId(UUID.randomUUID());
        bankQuestion2.setQuestion(List.of(multipleQuestion2, matrixQuestion, fanQuestion, false2));

        Quiz quiz = new Quiz(UUID.randomUUID(), "Ciencia", category,
                List.of(bankQuestion2));

        System.out.println("Titulo del cuestionario: " + quiz.getTitle());
        System.out.println("Categoría del cuestionario: " +
                quiz.getCategory().getName());
        System.out.println("Lista de preguntas: ");
        for (Question question : bankQuestion2.getQuestion()) {
            System.out.println("Question: " + question.getTextQuestion());
            System.out.println("Category: " + question.getSubCategory());
            System.out.println("Type: " + question.getType());

        }

    }
}
