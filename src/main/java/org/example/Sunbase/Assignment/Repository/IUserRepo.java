package org.example.Sunbase.Assignment.Repository;

import org.example.Sunbase.Assignment.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {


    Optional<User> getByuserEmail(String userEmail);

    User getByFirstName(String firstName);
}
