package springframework.beans;

import org.junit.Test;
import springframework.beans.factory.config.BeanDefinition;
import springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @description:
 * @author：liangguangqing
 * @date：2023/3/3 14:40
 */
public class ApiTest {

    @Test
    public void test_beanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from singleton
        UserService userService1 = (UserService)beanFactory.getSingleton("userService");
        userService1.queryUserInfo();
    }
}
