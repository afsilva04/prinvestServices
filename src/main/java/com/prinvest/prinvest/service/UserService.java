package com.prinvest.prinvest.service;

import com.prinvest.prinvest.domain.User;
import com.prinvest.prinvest.persistence.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public User getOne(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
