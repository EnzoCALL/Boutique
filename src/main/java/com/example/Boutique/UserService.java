package com.example.Boutique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    public User registerNewUserAccount(UserDTO userDTO) {

        User u = new User();
        u.setEnabled(1);
        u.setUsername(userDTO.getUserName());
        u.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
        u.setRole("ROLE_USER");

        u.setFirstName(userDTO.getFirstName());
        u.setLastName(userDTO.getLastName());
        u.setEmail(userDTO.getEmail());

        return userRepository.save(u);
    }
}