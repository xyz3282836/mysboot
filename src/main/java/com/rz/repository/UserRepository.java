package com.rz.repository;

import com.rz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhou on 2017/4/10.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
