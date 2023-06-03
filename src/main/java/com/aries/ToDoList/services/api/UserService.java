package com.aries.ToDoList.services.api;

import com.aries.ToDoList.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User get(Integer id);
    Integer add (User user);
    void delete (Integer id);
    void update (Integer id, User user);

}
