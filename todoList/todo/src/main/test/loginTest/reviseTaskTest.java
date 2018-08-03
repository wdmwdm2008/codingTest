package loginTest;

import cn.org.ltl.dao.TaskDao;
import cn.org.ltl.service.TaskService;
import cn.org.ltl.service.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;

public class reviseTaskTest {
    ApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1(){
        TaskDao taskDao = ac.getBean("taskDao", TaskDao.class);
        Timestamp time = Timestamp.valueOf("2018-11-26 20:11:00");
        taskDao.reviseTask(1531785275566L, "ddd", "fddd", time);
        System.out.println(32);
    }

    @Test
    public void test2(){
        TaskDao taskDao = ac.getBean("taskDao", TaskDao.class);
        Timestamp time = Timestamp.valueOf("2018-11-26 20:11:00");
        taskDao.reviseSubtask(1531800101715L, "dsaf", "asff", 100, 50, "comments!");
        System.out.println(56);
    }
}
