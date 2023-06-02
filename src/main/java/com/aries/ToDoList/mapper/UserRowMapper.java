package com.aries.ToDoList.mapper;

import com.aries.ToDoList.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setSurname(rs.getString("surname"));
        user.setNickname(rs.getString("nickname"));
        user.setEmail(rs.getString("email"));
        user.setAge(rs.getInt("age"));
        user.setPassword(rs.getString("password"));
        return user;
    }
}
