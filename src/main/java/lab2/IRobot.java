package lab2;



/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @Autowired
    private Speaker speaker;

    @Autowired
    private Speaker speaker2;
    @Autowired
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("Job started");
        cleaner.clean();
        speaker.speak("Job finished");
    }
}
