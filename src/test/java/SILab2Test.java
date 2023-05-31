import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<User> users = new ArrayList<>(List.of(new User("user", "useruser", "user@example.com")));

    @Test
    void functionMultipleCondition() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null, users));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User("user", null, "user@user.com"), users));
        assertThrows(RuntimeException.class, () -> SILab2.function(new User("user", "user", null), users));
        assertDoesNotThrow(() -> SILab2.function(new User("user", "user", "user"), users), "Mandatory information missing!");

    }

    @Test
    void functionEveryBranch() {
        //asserts za Every Branch kriteriumot koi se navedeni vo README.md
    }
}