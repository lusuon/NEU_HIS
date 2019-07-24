package com.neu.his.service.users;

import com.neu.his.dao.AllUserMapper;
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
        AllUserEntity userInDB = allUserMapper.findByUsername(user);
        if(userInDB != null) return pass.equals(userInDB.getPassword());
        else return false;
    }
}
