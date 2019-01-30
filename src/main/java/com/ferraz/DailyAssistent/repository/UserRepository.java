package com.ferraz.DailyAssistent.repository;

import org.springframework.data.repository.CrudRepository;

import com.ferraz.DailyAssistent.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
