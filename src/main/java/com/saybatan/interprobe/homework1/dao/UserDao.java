package com.saybatan.interprobe.homework1.dao;

import com.saybatan.interprobe.homework1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User, Long> {

}
