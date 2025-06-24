package com.tasksprint.service;

import com.tasksprint.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICourseService extends IGenericService<Course, Integer> {
    Page<Course> listPage(Pageable pageable);
}
