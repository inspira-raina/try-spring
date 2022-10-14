package org.ait.project.template.modules.user.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.user.model.entity.User;
import org.ait.project.template.modules.user.model.repository.UserRepository;
import org.ait.project.template.modules.user.service.delegate.UserServiceDelegate;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceDelegateImpl implements UserServiceDelegate {

    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        user.setCreatedAt(ZonedDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Integer id, User user) {
        user.setId(id);
        user.setName(user.getName());
        user.setEmail(user.getEmail());
        user.setPhoneNumber(user.getPhoneNumber());
        user.setUpdatedAt(ZonedDateTime.now());
        return userRepository.save(user);
    }
}
