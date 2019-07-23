package com.neu.his.service.users;

import com.neu.his.dao.interfaces.AllUserMapper;
import com.neu.his.entity.AllUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllUserService{
    @Autowired
    AllUserMapper allUserMapper;

    /**
     * 获取科室下所有医生
     * @return
     */
    public List<AllUserEntity> getAllDoctor(){
        return allUserMapper.findAllByUserType("3");
    }

    /**
     * 登录验证
     * @param user
     * @param pass
     * @return
     */
    public boolean login(String user,String pass) {
        //考虑将此类的功能并入AllUserService
        String truePass = allUserMapper.findByUsername(user).getPassword();
        return truePass.equals(pass);
    }
}
