package com.poc.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepository extends JpaRepository<Users, Long>{

}
