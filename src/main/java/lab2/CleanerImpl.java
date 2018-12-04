package lab2;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min=3, max=70)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVvvvvvvvvv");
        }
    }
}
