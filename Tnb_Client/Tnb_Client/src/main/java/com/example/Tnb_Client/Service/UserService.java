package com.example.Tnb_Client.Service;

import com.example.Tnb_Client.Model.User;
import com.example.Tnb_Client.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;

        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        public void register(User user) {

            if (userRepository.findByUsername(user.getUsername()) == null) {

                user.setPassword(passwordEncoder.encode(user.getPassword()));
                userRepository.save(user);
            } else {

            }
        }
}


