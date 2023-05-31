package com.aries.ToDoList.mapper;

import com.aries.ToDoList.domain.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {
    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task();
        task.setId(rs.getInt("id"));
        task.setUserId(rs.getInt("userId"));
        task.setName(rs.getString("name"));
        task.setStatus(rs.getInt("status"));
        task.setCategory(rs.getString("category"));
        task.setDescription(rs.getString("description"));
        task.setCreatedAt(rs.getTimestamp("createdAt"));
        return task;
    }
}
