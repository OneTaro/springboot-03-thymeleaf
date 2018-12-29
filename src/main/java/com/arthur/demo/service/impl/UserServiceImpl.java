package com.arthur.demo.service.impl;

import com.arthur.demo.entity.User;
import com.arthur.demo.repository.UserRepository;
import com.arthur.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getUserList() {
        return repository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return repository.findById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void edit(User user) {
        repository.save(user);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
