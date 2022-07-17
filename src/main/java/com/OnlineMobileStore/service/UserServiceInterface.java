package com.OnlineMobileStore.service;
import com.OnlineMobileStore.entities.UserModel;
import com.OnlineMobileStore.entities.UserModel;
import com.OnlineMobileStore.exception.InvalidLoginDetails;
import org.springframework.stereotype.Service;
@Service
public interface UserServiceInterface {
    public UserModel validateUser(String username, String password);
    public UserModel addUser(UserModel user);
    public UserModel removeUser(UserModel user);
    public int Login_User(String userName, String userPassword)throws InvalidLoginDetails;
}