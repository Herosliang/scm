package utillty;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by liangwei on 2018/1/13.
 */
public class Testng {

    @Test
    public void method1 (){
        System.out.println("测试方法1");
        //Assert.assertEquals( message,"test","测试一下");
    }

    @Test
    public void method2(){
        System.out.println("测试方法2");

    }

    public static void main(String[] args){
        Testng testng = new Testng();
        String orderId = "201801130001";
        System.out.println(orderId);
        testng.method1();
        testng.method2();

    }
}
