package lombok_examples;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.Wither;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Builder
@ToString
@Wither
public class PolicyService {

    @Singular("oneFish")
    private Map<String, Integer> fish;
    @NonNull
    private Integer vetek;
    @NonNull
    private Integer amountOfAccidents;
    private Integer numOfYears;


    public double calcPolicyForPrivate() {
        return 0;
    }


    }



