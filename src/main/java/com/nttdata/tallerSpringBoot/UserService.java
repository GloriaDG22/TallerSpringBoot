package com.nttdata.tallerSpringBoot;

import java.util.List;

public interface UserService {

    public List<User> getAllUser ();

    public User getUserById (int id);

    public User saveUser(User user);

    public User updateUser(User user);

    public void deleteUser(int id);

}
