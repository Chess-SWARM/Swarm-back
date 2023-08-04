package org.chessmooc.swarm.back.core.users;

import org.chessmooc.swarm.back.core.config.CoreConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.fail;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@ContextConfiguration(classes = CoreConfig.class)
public class UserAuthenticationTests {

    @Test
    void contextLoad() {

    }

    @Test
    @DisplayName("A registered user with good credential can authenticate without exception")
    void authenticateARegisteredUserShouldNotThrowAnException() {
        // TODO: implement me!
        fail("Not yet implemented");
    }

    @Test
    @DisplayName("Bad credential should throw a BadCredentialException")
    void badCredentialShouldThrowAnException() {
        // TODO: implement me!
        fail("Not yet implemented");
    }
}
