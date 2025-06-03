package com.tasksprint.repo;

import com.tasksprint.model.User;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepo extends  IGenericRepo<User, Integer>{
    //SELECT * FROM User u WHERE u.username = ?
    // @Query("FROM User u WHERE u.username = :username")
    // DerivedQueries
    User findOneByUsername(String username);
}
