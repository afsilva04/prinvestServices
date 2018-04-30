package com.prinvest.prinvest.persistence;

import com.prinvest.prinvest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
