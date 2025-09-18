package dev.java10x.UserManagement;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    public List<String> users = new ArrayList<>(List.of("Alice", "Bob", "Carlos"));

    @GetMapping
    public List<String> getUsers() {
        return users;
    }

    @PostMapping
    public List<String> addUser(@RequestBody String user) {
        users.add(user);
        return users;
    }
}
