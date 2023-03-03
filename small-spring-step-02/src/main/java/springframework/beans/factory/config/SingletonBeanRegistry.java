package springframework.beans.factory.config;

/**
 * @description:
 * @author：liangguangqing
 * @date：2022/12/23 10:08
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
