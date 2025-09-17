package dev.java10x.UserManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Alice", "Bob", "Carlos");
    }

    @PostMapping
    public String addUser(@RequestBody String user) {
        return "User " + user + " added!";
    }
}
