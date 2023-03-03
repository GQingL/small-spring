package com.study.springframework;

/**
 * @description: bean的定义
 * @author：liangguangqing
 * @date：2022/12/22 15:28
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}
