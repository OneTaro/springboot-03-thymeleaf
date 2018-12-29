package com.arthur.demo.repository;

import com.arthur.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    @Transactional
    Long deleteById(long id); // 删除需要开启事物
}
