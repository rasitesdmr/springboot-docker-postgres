package com.example.springbootdockerpostgres.service;
import com.example.springbootdockerpostgres.dto.UserDTO;
import com.example.springbootdockerpostgres.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getByUserId(Long id);

    List<User> getUsers();

    User createUser(UserDTO userDTO);

    User updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);


}
