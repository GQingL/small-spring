package springframework.beans.factory;

import springframework.beans.BeansException;

/**
 * @description: bean工厂
 * @author：liangguangqing
 * @date：2022/12/22 15:28
 */
public interface BeanFactory {

    /**
     * 根据name获取bean
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;

}
