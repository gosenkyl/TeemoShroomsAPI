package com.teemo.shrooms.repository;

import com.teemo.shrooms.dso.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String> {

    List<User> findByUserName(String userName);

}
