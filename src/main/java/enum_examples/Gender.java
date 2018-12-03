package enum_examples;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */

@Getter
public enum Gender {
    MALE(1, "גבר"), FEMALE(2, "אישה");



    private Gender(int dbCode, String hebrewDesc) {
        System.out.println("I was invoked");
        System.out.println("dbCode = " + dbCode);
        System.out.println("hebrewDesc = " + hebrewDesc);
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
    }

    private int dbCode;
    private String hebrewDesc;

    public static Gender findByDbCode(int dbCode) throws IllegalStateException {
        Gender[] genders = values();
        for (Gender gender : genders) {
            if (gender.dbCode == dbCode) {
                return gender;
            }
        }
        throw new IllegalStateException(dbCode + " not supported yet");
    }



}



