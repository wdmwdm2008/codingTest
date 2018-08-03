package loginTest;

import cn.org.ltl.dao.TaskDao;
import cn.org.ltl.service.TaskService;
import cn.org.ltl.service.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;

public class checkTaskTest {
    ApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1(){
        TaskDao taskDao = ac.getBean("taskDao", TaskDao.class);
        System.out.println(taskDao.checkTasks());
    }

    @Test
    public void test2(){
        TaskService taskService = ac.getBean("taskServiceImpl", TaskServiceImpl.class);
        System.out.print(taskService.checkTasks());
    }
}
