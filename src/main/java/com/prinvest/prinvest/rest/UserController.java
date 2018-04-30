package com.prinvest.prinvest.rest;

import com.prinvest.prinvest.domain.User;
import com.prinvest.prinvest.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}
