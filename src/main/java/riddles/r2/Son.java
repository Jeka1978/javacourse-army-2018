package riddles.r2;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {

    private double pi = Math.PI;

    public Son() {
        printPi();
    }

    @Override
    public void printPi() {
        System.out.println(pi);
    }

    public static void main(String[] args) {
        new Son();
    }
}




