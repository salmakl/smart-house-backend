package com.starter.app.service;

import com.starter.app.model.User;
import com.starter.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public List<User> getAll() {

        return userRepository.findAll();
    }


    public User findByUsername(String username) {

        return userRepository.findByUsername(username);

    }


    public User addUser(User user){
        return userRepository.save(user);
    }
}
