package xin.gonefuture.java.api.io;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/7/1 17:10.
 *  说明：
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;




/**
 * <pre> </pre>
 */
public class DirectoryDemoTest {

    DirectoryDemo directoryDemo;

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Before
    public void prepare() {
        directoryDemo = new DirectoryDemo();
    }


    @Test
    public void whenSearchingTheCurrentDirectory() {

        Assert.assertTrue("目录是否遍历成功",
                DirectoryDemo.find(new File(".")));
    }

    @Test
    public void whenSearchingNullDirectory() {
        exception.expect(NullPointerException.class);
        DirectoryDemo.find(null);
    }


    @Test
    public void whenSearchingEmptyDirectory() {
        exception.expect(RuntimeException.class);
        DirectoryDemo.find(new File("555"));
    }



}
