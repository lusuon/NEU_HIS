package com.neu.his.service;

import com.neu.his.common.response.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    AllUserService allUserService;
    public CommonResponse login() {
        //考虑将此类的功能并入AllUserService
        return null;
    }
}
