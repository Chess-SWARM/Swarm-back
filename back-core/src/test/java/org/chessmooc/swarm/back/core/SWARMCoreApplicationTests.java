package org.chessmooc.swarm.back.core;

import org.chessmooc.swarm.back.core.config.CoreConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@ContextConfiguration(classes = CoreConfig.class)
public class SWARMCoreApplicationTests {

    @Test
    void contextLoad() {

    }
}
