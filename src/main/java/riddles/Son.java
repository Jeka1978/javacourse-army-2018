package riddles;

/**
 * @author Evgeny Borisov
 */
public class Son extends Mother{

    public void talk(){
        System.out.println("Son is talking");
    }

    public static void main(String[] args) {
        new Son();
    }
}
