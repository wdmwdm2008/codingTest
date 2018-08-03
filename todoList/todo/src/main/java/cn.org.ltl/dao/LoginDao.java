package cn.org.ltl.dao;

import cn.org.ltl.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("loginDao")
public interface LoginDao {
    public List<User> loginValidation(String username, String pwd);
}
