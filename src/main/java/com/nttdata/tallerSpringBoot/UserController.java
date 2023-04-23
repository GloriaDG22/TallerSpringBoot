package com.nttdata.tallerSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping (value = "/users")
    public ResponseEntity<User> list() {
        List<User> users = userService.getAllUser();
        return new ResponseEntity(users, HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> userById(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<User> create( @RequestBody User user) {
        User userCreated = userService.saveUser(user);
        return new ResponseEntity(userCreated, HttpStatus.CREATED);
    }

    @PutMapping(value = "/user/{id}")
    public ResponseEntity<User> update(@PathVariable("id") int id, @RequestBody User user) {
        User userCreated = userService.getUserById(id);

        if (userCreated != null) {
            // el id no se cambia
            userCreated.setName(user.getName());
            userCreated.setBirthDate(user.getBirthDate());

            userService.updateUser(userCreated);
        }
        return new ResponseEntity(userCreated, HttpStatus.CREATED);
    }


    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {

        userService.deleteUser(id);

        return new ResponseEntity<>("User eliminado.", HttpStatus.OK);
    }
}

