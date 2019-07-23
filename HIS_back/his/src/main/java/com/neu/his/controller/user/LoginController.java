package com.neu.his.controller.user;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.requestBodyClass.LoginUser;
import com.neu.his.service.users.AllUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AllUserService allUserService;
    /**
     * 获取请求中的user与password
     * @return
     */
    @PostMapping("/api/login")
    public CommonResponse login(@RequestBody LoginUser loginUser){
        return allUserService.login(loginUser.getUser(),loginUser.getPass())?CommonResponse.succuess():CommonResponse.fail();
    }
}
