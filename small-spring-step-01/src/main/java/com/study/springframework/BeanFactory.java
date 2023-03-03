package com.study.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: bean工厂
 * @author：liangguangqing
 * @date：2022/12/22 15:28
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
