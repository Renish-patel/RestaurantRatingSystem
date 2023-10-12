package com.lcwd.user.service.Repositories;

import com.lcwd.user.service.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
