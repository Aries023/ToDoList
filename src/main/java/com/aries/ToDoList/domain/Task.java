package com.aries.ToDoList.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;
import java.time.Instant;

public class Task {
    @Nullable
    private Integer id;
    @NonNull
    private Integer userId;
    @NonNull
    private String name;
    @NonNull
    private Integer status;
    @NonNull
    private String category;
    @NonNull
    private String description;
    @NonNull
    private Timestamp createdAt;

    public Task() {
    }

    public Task(@Nullable Integer id, @NonNull Integer userId, @NonNull String name, @NonNull Integer status, @NonNull String category, @NonNull String description, @NonNull Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.status = status;
        this.category = category;
        this.description = description;
        this.createdAt = Timestamp.from(Instant.now());
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @NonNull
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@NonNull Integer userId) {
        this.userId = userId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public Integer getStatus() {
        return status;
    }

    public void setStatus(@NonNull Integer status) {
        this.status = status;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NonNull Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

}
