package springframework.beans;

/**
 * @description:
 * @author：liangguangqing
 * @date：2022/12/23 10:26
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg,cause);
    }
}
