package com.tasksprint.service;

import com.tasksprint.model.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getMenusByUsername(String username);
}
