package me.abhishek.springboot.microservice.example.users.springbootmicroservicetodoservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	Users findByNameIgnoreCaseContaining(String name);
}