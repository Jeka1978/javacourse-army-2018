package lab2;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
