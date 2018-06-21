package ar.edu.unlp.pasae.pasaepractica.user;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

@Named
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByUsername(String username);

}
