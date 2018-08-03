package loginTest;

import cn.org.ltl.dao.TaskDao;
import cn.org.ltl.service.TaskService;
import cn.org.ltl.service.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;

public class addSubtaskTest {
    ApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1(){
        TaskDao taskDao = ac.getBean("taskDao", TaskDao.class);
        Timestamp time = Timestamp.valueOf("2018-11-26 20:11:00");
        taskDao.addSubtask(7, "This is subtask_7", "wdm2", 100, 10, "This is com1", 100);
        System.out.println(23);
    }

    @Test
    public void test2(){
        TaskService taskService = ac.getBean("taskServiceImpl", TaskServiceImpl.class);
        Timestamp time = Timestamp.valueOf("2018-11-26 20:11:00");
        taskService.addSubtask(8, "This is subtask_7", "wdm2", 100, 10, "This is com1", 100);
        System.out.println(23);
    }
}
