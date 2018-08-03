package loginTest;

import cn.org.ltl.dao.LoginDao;
import cn.org.ltl.service.LoginService;
import cn.org.ltl.service.LoginServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class loginTest {
    ApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1(){
        LoginDao loginDao = ac.getBean("loginDao", LoginDao.class);
        System.out.println(loginDao.loginValidation("zhangsan", "24"));
        System.out.println(loginDao.loginValidation("zhangsan", "24").isEmpty());
    }

    @Test
    public void test2(){
        LoginService loginService = ac.getBean("loginServiceImpl", LoginServiceImpl.class);
        System.out.println(loginService.loginVilidation("zhangsan", "234"));
    }
}
