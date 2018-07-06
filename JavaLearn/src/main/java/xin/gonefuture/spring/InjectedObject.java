package xin.gonefuture.spring;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/15 21:52.
 *  说明：
 */

/**
 * <pre> </pre>
 */
public class InjectedObject {
    Object object;

    InjectedObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "InjectedObject{" +
                "object=" + object +
                '}';
    }
}
