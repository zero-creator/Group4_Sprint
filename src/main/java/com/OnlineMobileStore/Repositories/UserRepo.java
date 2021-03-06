package com.OnlineMobileStore.Repositories;

import com.OnlineMobileStore.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

    public Optional<UserModel> findByEmailId(String email);

    //public Optional<UserModel> findByEmailIdAndUserPassword(String email, String userPassword);
}
