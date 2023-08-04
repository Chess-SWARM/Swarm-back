package org.chessmooc.swarm.back.core.repository;

import org.chessmooc.swarm.back.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
