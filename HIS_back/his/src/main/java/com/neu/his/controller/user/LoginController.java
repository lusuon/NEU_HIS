package com.neu.his.controller.user;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.service.users.AllUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
    @PostMapping("/login")
    public CommonResponse login(
            @RequestParam("user") String user,
            @RequestParam("pass") String pass
    ){
        return allUserService.login(user, pass)?CommonResponse.succuess():CommonResponse.fail();
    }
}
