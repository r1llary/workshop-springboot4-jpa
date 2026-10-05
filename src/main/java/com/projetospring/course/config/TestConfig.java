package com.projetospring.course.config;

import com.projetospring.course.entities.User;
import com.projetospring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u2 = new User(null, "José Maria", "jose@gmail", "36958647544", "987654321");
        User u1 = new User(null, "Maria José", "maria@gmail", "326354651", "123456789");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
