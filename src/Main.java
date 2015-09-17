import java.util.Arrays;

/**
 * Created by tomer on 8/17/15.
 */
public class Main extends JavaPin {
    private static final String[] girls_names = {"Sheli", "Naomi"};
    private static final String[] parameters = {"Character", "Experience", "Patience", "Attractiveness", "Common Interests", "Hair", "Face", "Chest", "Body Hair", "Butt", "Legs"};
    private static String[][] girls_scores = new String[girls_names.length][parameters.length];
    private static userInput input = new userInput();

    public static void main(String[] args) {
        try {
            println("Enter numbers between 0-3 except for when a girl's part is so hot that you think it should get more than 3");
            for (String name : girls_names) {
                for (String parameter : parameters) {//The input value must be a number between 0-340282300000000000000000000000000000000
                    println("What do you think about " + name + "'s " + parameter + "?");
                    girls_scores[Arrays.asList(girls_names).indexOf(name)][Arrays.asList(parameters).indexOf(parameter)] = input.getUserInput();
                }
            }
            for (int i = 0; i < girls_scores.length; i++) {
                float girlCounter = 0;
                for (int j = 0; j < girls_scores[i].length; j++) {
                    girlCounter += Float.parseFloat(girls_scores[i][j]);
                }
                float finalVal = girlCounter / girls_scores[i].length;
                println(girls_names[i] + " scored " + finalVal); //Prints the average of the girl values
            }
        } catch (Exception e) {
            println("FUCK U STUPD NIGRO U DON'T KNW READ MAFACKA");
        }
    }
}
