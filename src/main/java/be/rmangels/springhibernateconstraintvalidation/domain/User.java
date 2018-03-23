package be.rmangels.springhibernateconstraintvalidation.domain;

import be.rmangels.springhibernateconstraintvalidation.domain.validators.UserDescription;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private Long id;

    @NotNull
    @UserDescription
    @Column(name = "description")
    private String description;
}
