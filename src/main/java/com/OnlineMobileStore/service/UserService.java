package com.OnlineMobileStore.service;

import com.OnlineMobileStore.entities.UserModel;
import com.OnlineMobileStore.exception.InvalidLoginDetails;
import com.OnlineMobileStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import com.OnlineMobileStore.entities.UserModel;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserService userService;


    @Autowired
    final private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @Override
    public UserModel validateUser(String username, String password) {
        return null;
    }

    @Override
    public UserModel addUser(UserModel user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public UserModel removeUser(UserModel user) {
        return null;
    }


    public int Login_User(String userName, String userPassword)throws InvalidLoginDetails {


        Optional<UserModel> optionalProduct = userRepository.findByUserNameAndUserPassword(userName,userPassword);
        if (!optionalProduct.isPresent())
            throw new InvalidLoginDetails("user details are invalid ");
        return optionalProduct.get().getUserID();
    }


//    @Override
//    public UserModel validateUser(String username, String password) {
//        return null;
//    }
//
//    @Override
//    public UserModel addUser(UserModel user) {
//        return null;
//    }
//
//    @Override
//    public UserModel removeUser(UserModel user) {
//        return null;
//    }
}
