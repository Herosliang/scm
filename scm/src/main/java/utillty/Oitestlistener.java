package utillty;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by liangwei on 2018/1/13.
 */
public class Oitestlistener extends TestListenerAdapter{
    public void onTestStart(ITestResult var1){
        System.out.println("testStart"+var1.getName());
        super.onTestStart(var1);
    }

    public void onTestSuccess(ITestResult var1){
        System.out.println("测试成功了"+var1.getInstance());
        super.onTestSuccess(var1);
    }

    public void onTestFailure(ITestResult var1){
        System.out.println("测试失败了"+var1.getInstance());
    }

    public void onTestSkipped(ITestResult var1){
        System.out.println("测试跳过了"+var1.getInstance());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult var1){
        System.out.println("TestFailedButWithinSuccessPercentage(了"+var1.getInstance());
    }

    public void onStart(ITestContext var1){
        System.out.println("onstart"+var1.getSuite().getName()+"方法个数"+var1.getSuite().getAllMethods().size()+
                "rusults"+var1.getSuite().getResults()+"suiteXML"+var1.getSuite().getXmlSuite() +"\n");
    }

    public void onFinish(ITestContext var1){
        System.out.println("onfinish"+var1.getOutputDirectory());
    }

}

