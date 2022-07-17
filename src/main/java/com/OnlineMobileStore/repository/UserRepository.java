package com.OnlineMobileStore.repository;

import com.OnlineMobileStore.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Integer>{

    Optional<UserModel> findByUserNameAndUserPassword(String userName, String userPassword);


}





