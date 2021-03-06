package concurrent;

import java.util.concurrent.Callable;

/**
 * @author lmc
 * @date 2019/12/24
 */
public class CallTask implements Callable<String> {
    /*
    Runnable和Callable的区别
    相同点
    1、两者都是接口；（废话）
    2、两者都可用来编写多线程程序；
    3、两者都需要调用Thread.start()启动线程；

    不同点
    1、两者最大的不同点是：实现Callable接口的任务线程能返回执行结果；而实现Runnable接口的任务线程不能返回结果；
    2、Callable接口的call()方法允许抛出异常；而Runnable接口的run()方法的异常只能在内部消化，不能继续上抛；

    注意点
    Callable接口支持返回执行结果，此时需要调用FutureTask.get()方法实现，此方法会阻塞主线程直到获取‘将来’结果；当不调用此方法时，主线程不会阻塞！
     */
    @Override
    public String call() throws Exception {
        synchronized (this){
            this.wait();
        }
        System.out.println("to do something!");
        return "ok";
    }
}
