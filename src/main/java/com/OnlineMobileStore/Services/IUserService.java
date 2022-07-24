package com.OnlineMobileStore.Services;
import com.OnlineMobileStore.Exceptions.MobileNotFoundException;
import com.OnlineMobileStore.common.LoginResponse;
import com.OnlineMobileStore.entities.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {

    public LoginResponse addUser(UserModel user);
    public List<UserModel> showAllCustomers();
    public LoginResponse Login_User(String userName, String userPassword);
    public UserModel getUserById(int userId) throws MobileNotFoundException;
}