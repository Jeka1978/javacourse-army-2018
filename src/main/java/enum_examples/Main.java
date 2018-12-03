package enum_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        Gender gender = Gender.findByDbCode(2);
        String hebrewDesc = gender.getHebrewDesc();
        System.out.println("hebrewDesc = " + hebrewDesc);
    }
}
