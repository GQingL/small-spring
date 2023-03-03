package springframework.beans.factory.support;

import springframework.beans.factory.config.BeanDefinition;

/**
 * @description:
 * @author：liangguangqing
 * @date：2022/12/23 10:20
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
