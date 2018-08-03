package cn.org.ltl.service;

import cn.org.ltl.dao.LoginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginDao loginDao;

    @Override
    public boolean loginVilidation(String username, String pwd) {
        if (!loginDao.loginValidation(username, pwd).isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
