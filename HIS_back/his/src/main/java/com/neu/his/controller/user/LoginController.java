package com.neu.his.controller.user;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;
    /**
     * 获取请求中的user与password
     * @return
     */
    @PostMapping("/login")
    public CommonResponse login(){
        return loginService.login();
    }
}
