package constant;

import org.apache.commons.lang3.RandomStringUtils;

public class CourierLoginDataRandom {
    public static final String LOGIN_RANDOMIZED = RandomStringUtils.randomAlphanumeric(10);
    public static final String PASSWORD_RANDOMIZED = RandomStringUtils.randomAlphanumeric(10);
    public static final String FIRST_NAME_RANDOMIZED = RandomStringUtils.randomAlphabetic(10);

    public static void main(String[] args) {
        System.out.println("random login: " + LOGIN_RANDOMIZED);
        System.out.println("random password: " + PASSWORD_RANDOMIZED);
        System.out.println("random firstName: " + FIRST_NAME_RANDOMIZED);
    }

}
