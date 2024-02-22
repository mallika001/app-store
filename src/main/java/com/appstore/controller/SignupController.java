package com.appstore.controller;

import com.appstore.dto.SignupDto;
import com.appstore.entity.SignupEntity;
import com.appstore.repository.SignupRepository;
import com.appstore.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired(required=true)
    SignupService signupService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupUser(@RequestBody SignupDto signupDto) {
        SignupEntity response = signupService.saveUser(signupDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
