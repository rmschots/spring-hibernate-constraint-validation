package be.rmangels.springhibernateconstraintvalidation.rest;

import be.rmangels.springhibernateconstraintvalidation.domain.User;
import be.rmangels.springhibernateconstraintvalidation.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    User getUser(@PathVariable Long id) {
        return userRepository.findOne(id);
    }

    @GetMapping("/lulz")
    User createUser() {
        User user = User.builder().description("oioi").build();

        return userRepository.save(user);
    }
}
