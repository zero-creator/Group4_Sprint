package com.OnlineMobileStore.controllers;


import com.OnlineMobileStore.entities.UserModel;
import com.OnlineMobileStore.exception.InvalidLoginDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OnlineMobileStore.service.UserService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("User")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserModel> regsiterUser(@Valid @RequestBody UserModel user) {
        UserModel userNew = userService.addUser(user);

        return new ResponseEntity<>(userNew, HttpStatus.CREATED);
    }

    @PostMapping("/login")
        public ResponseEntity<Map<String,String>> getLogin(@RequestBody HashMap<String,String> Login_input) throws InvalidLoginDetails {
             Map<String,String> response = new HashMap<String,String>();
             String userName= Login_input.get("userName");
             String userPassword= Login_input.get("userPassword");
             //response.put("status","unsuccessful");
             int userId=userService.Login_User(userName,userPassword);

                 response.put("status","successful");
                 response.put("userId",Integer.toString(userId));

             return new ResponseEntity<Map<String,String>>(response,HttpStatus.OK);
    }


}
