package be.rmangels.springhibernateconstraintvalidation.repo;

import be.rmangels.springhibernateconstraintvalidation.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
