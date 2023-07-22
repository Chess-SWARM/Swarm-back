package org.chessmooc.swarm.back.core.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootConfiguration
@EnableTransactionManagement
@EntityScan("org.chessmooc.swarm.back.core.model")
@EnableJpaRepositories("org.chessmooc.swarm.back.core.repository")
@ComponentScan("org.chessmooc.swarm")
public class CoreConfig {

}
