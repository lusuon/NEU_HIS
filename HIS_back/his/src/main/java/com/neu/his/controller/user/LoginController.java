package com.neu.his.controller.user;

import com.neu.his.util.response.CommonResponse;
import com.neu.his.dao.entity.AllUserEntity;
import com.neu.his.util.requestBody.user.LoginBody;
import com.neu.his.service.users.AllUserService;
import com.neu.his.util.auth.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {

    @Autowired
    AllUserService allUserService;
    /**
     * 获取请求中的user与password
     * @return
     */
    @PostMapping("/api/login")
    public CommonResponse login(@RequestBody LoginBody loginBody){
        System.out.println("Received login request.");
        HashMap<String,Object> tokens = new HashMap<>();
        if (allUserService.login(loginBody.getUser(), loginBody.getPass())){
            AllUserEntity user = allUserService.getUserByUsername(loginBody.getUser());
            tokens.put("user",user);
            tokens.put("jwt",JWTUtil.sign(loginBody.getUser(),loginBody.getPass()));
            System.out.println("correct: "+loginBody.getUser());
            return CommonResponse.succuess(tokens);
        }else{
            System.out.println("fail: "+loginBody.getUser());
            return CommonResponse.fail();
        }
    }
}
