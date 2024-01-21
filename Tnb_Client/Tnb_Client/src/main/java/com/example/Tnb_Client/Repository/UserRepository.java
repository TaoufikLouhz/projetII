package com.example.Tnb_Client.Repository;


import com.example.Tnb_Client.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
    }


