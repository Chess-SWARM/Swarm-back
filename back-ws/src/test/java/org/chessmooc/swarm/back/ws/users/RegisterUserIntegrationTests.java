package org.chessmooc.swarm.back.ws.users;


import lombok.RequiredArgsConstructor;
import org.chessmooc.swarm.back.core.config.CoreConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
@ContextConfiguration(classes = CoreConfig.class)
@RequiredArgsConstructor
public class RegisterUserIntegrationTests {

    private final MockMvc mockMvc;
    @Test
    @DisplayName("Register a user not registered should return 201")
    void registerUserWithoutException() throws Exception {
        // TODO: implement me!
        fail("Not yet implemented");
        mockMvc.perform(post("/users/register"))
               .andExpect(status().isCreated());
    }
}
