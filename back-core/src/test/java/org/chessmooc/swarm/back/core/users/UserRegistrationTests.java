package org.chessmooc.swarm.back.core.users;


import org.chessmooc.swarm.back.core.config.CoreConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@ContextConfiguration(classes = CoreConfig.class)
public class UserRegistrationTests {

    @Test
    void contextLoad() {

    }

    @Test
    @DisplayName("Register a user not registered should not throw an exception !")
    void registerAnUnregisteredUserShouldNotThrowAnException() {
        // TODO: implement me!
        fail("Not yet implemented");
    }

    @Test
    @DisplayName("Register a user already registered should throw a AlreadyRegisterException")
    void registerAnRegisteredUserShouldThrowAnException() {
        // TODO: implement me!
        fail("Not yet implemented");
    }

    @Test
    @DisplayName("A registering user need to have a username, mail, password")
    void registerAnUserNeedUsernameEmailAndPassword() {
        // TODO: implement me!
        fail("Not yet implemented");
    }

}
