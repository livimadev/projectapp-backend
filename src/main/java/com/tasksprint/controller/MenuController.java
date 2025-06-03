package com.tasksprint.controller;

import com.tasksprint.dto.MenuDTO;
import com.tasksprint.service.IMenuService;
import com.tasksprint.util.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {
    private final IMenuService service;
    private final MapperUtil mapperUtil;

    @PostMapping("/user")
    public ResponseEntity<List<MenuDTO>> getMenusByUser(){ //@RequestBody String username
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        List<MenuDTO> listDTO = mapperUtil.mapList(service.getMenusByUsername(username), MenuDTO.class);

        return ResponseEntity.ok(listDTO);
    }
}
