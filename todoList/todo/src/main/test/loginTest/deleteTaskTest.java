package loginTest;

import cn.org.ltl.dao.TaskDao;
import cn.org.ltl.service.TaskService;
import cn.org.ltl.service.TaskServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deleteTaskTest {
    ApplicationContext ac;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    }

    @Test
    public void test1(){
        TaskDao taskDao = ac.getBean("taskDao", TaskDao.class);
        taskDao.deleteSubtask(1531783745536L);
        System.out.println(22);
    }

//    @Test
//    public void test2(){
//        TaskService taskService = ac.getBean("taskServiceImpl", TaskServiceImpl.class);
//        System.out.print(taskService.deleteTask((long)1531783745536));
//    }
}
