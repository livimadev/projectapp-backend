package com.tasksprint.service.impl;

import com.tasksprint.model.Menu;
import com.tasksprint.repo.IGenericRepo;
import com.tasksprint.repo.IMenuRepo;
import com.tasksprint.service.IMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService extends GenericService<Menu, Integer> implements IMenuService {
    private final IMenuRepo repo;

    @Override
    protected IGenericRepo<Menu, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<Menu> getMenusByUsername(String username) {
        return repo.getMenusByUsername(username);
    }
}
