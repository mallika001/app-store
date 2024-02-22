package com.appstore.service.impl;

import com.appstore.convertor.dto2entity.SignupConverter;
import com.appstore.dto.SignupDto;
import com.appstore.entity.SignupEntity;
import com.appstore.repository.SignupRepository;
import com.appstore.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupImpl implements SignupService {

    @Autowired
    SignupRepository signupRepository;

    @Override
    public SignupEntity saveUser(SignupDto signup) {
        SignupEntity signupEntity = SignupConverter.convertDtoToEntity(signup);
        return signupRepository.save(signupEntity);
    }
}
