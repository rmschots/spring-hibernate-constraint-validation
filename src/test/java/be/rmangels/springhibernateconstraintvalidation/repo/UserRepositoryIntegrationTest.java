package be.rmangels.springhibernateconstraintvalidation.repo;

import be.rmangels.springhibernateconstraintvalidation.Application;
import be.rmangels.springhibernateconstraintvalidation.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserRepositoryIntegrationTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        User user = User.builder().description("oioi").build();

        User result = userRepository.save(user);

        User foundUser = userRepository.findOne(result.getId());
        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getDescription()).isEqualTo("oioi");
    }

}