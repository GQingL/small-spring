package springframework.beans.factory.config;

/**
 * @description: bean的定义
 * @author：liangguangqing
 * @date：2022/12/22 15:28
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }
}
