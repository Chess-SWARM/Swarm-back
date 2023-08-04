package org.chessmooc.swarm.back.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "swarm_user")
public class User {

    @Id
    private Long id;
}
