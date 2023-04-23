package com.nttdata.tallerSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userImpl;

    @Override
    public List<User> getAllUser() {
        return userImpl.findAll();
    }

    @Override
    public User getUserById (int id){
        return userImpl.findUserById(id);
    }

    @Override
    public User saveUser(User user) {
        return userImpl.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userImpl.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userImpl.delete(this.getUserById(id));
    }

}
