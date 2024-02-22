package com.appstore.convertor.dto2entity;

import com.appstore.dto.SignupDto;
import com.appstore.entity.SignupEntity;
import org.springframework.stereotype.Service;

public class SignupConverter {

    public static SignupEntity convertDtoToEntity(SignupDto signupDto){
      SignupEntity signupEntity=new SignupEntity();
        signupEntity.setUsername(signupDto.getFirstName() + "_" + signupDto.getLastName());
        signupEntity.setEmail(signupDto.getEmail());
        signupEntity.setPassword(signupDto.getPassword());;
        return  signupEntity;
    }
}
