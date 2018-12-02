package lombok_examples;

import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Slf4j
public class Main {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}


