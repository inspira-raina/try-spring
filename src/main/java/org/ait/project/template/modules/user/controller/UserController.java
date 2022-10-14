package org.ait.project.template.modules.user.controller;

import lombok.AllArgsConstructor;

import org.ait.project.template.modules.user.dto.request.UserRequest;
import org.ait.project.template.modules.user.dto.response.UserResponse;
import org.ait.project.template.modules.user.service.internal.UserService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<ResponseTemplate<ResponseList<UserResponse>>> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping("/user/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> updateUser(@PathVariable Integer id, @RequestBody UserRequest userRequest) {
        return userService.updateUser(id, userRequest);
    }

    @PostMapping("/user")
    public ResponseEntity<ResponseTemplate<ResponseDetail<UserResponse>>> addUser(@Valid @RequestBody UserRequest projectRequest) {
        return userService.addUser(projectRequest);
    }
}
