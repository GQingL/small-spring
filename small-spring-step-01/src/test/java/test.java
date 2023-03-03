import com.study.springframework.BeanDefinition;
import com.study.springframework.BeanFactory;
import com.study.springframework.user.UserService;
import org.junit.Test;

/**
 * @description:
 * @author：liangguangqing
 * @date：2022/12/22 16:23
 */
public class test {

    @Test
    public void test_beanFactory(){
        //1.初始化bean factory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
