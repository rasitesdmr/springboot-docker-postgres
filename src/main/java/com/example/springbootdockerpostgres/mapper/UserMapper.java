package com.example.springbootdockerpostgres.mapper;

import com.example.springbootdockerpostgres.dto.UserDTO;
import com.example.springbootdockerpostgres.model.User;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    List<UserDTO> userToUserDTOList(List<User> users);
}
