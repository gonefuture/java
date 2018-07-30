package top.gonefuture.spring;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/6/16 20:28.
 *  说明：
 */

import org.springframework.beans.factory.FactoryBean;

/**
 * <pre>
 *     通过FactoryBean接口,采用编码的方式来实例化一个Bean,将实例化Bean的相关的复杂
 *  业务逻辑通过编码的方法在getObject中来实现.
 * </pre>
 */
public class UserFactoryBean implements FactoryBean<User> {
    private static final User user = new User();

    private String name;
    private String email;


    /*
        这里可以实现复杂业务逻辑,这里仅仅是演示代码,逻辑简单
     */
    @Override
    public User getObject() throws Exception {
        user.setName(name);
        user.setEmail(email);
        return user;
    }


    @Override
    public Class<?> getObjectType() {
        return User.class;
    }


    @Override
    public boolean isSingleton() {
        return true;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
