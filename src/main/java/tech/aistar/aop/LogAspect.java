package tech.aistar.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 本类功能:抽离出来的日志切面
 *
 * @author cxylk
 * @date 2020/9/28 9:56
 */
@Component //为了让这个类受容器管理
@Aspect //让该类成为切面
public class LogAspect {

    /**
     * 执行目标对象中的目标方法之前执行 - 前置日志
     *
     * 前置通知
     *
     * 通知规定了"何时"和"什么"
     * 1- 何时 - @Before
     * 2-"什么" - 这个通知中做什么事情
     *
     * 切入点 - "何处"
     */
    @Before(value="execution(* tech.aistar.aop.*.*(..))")
    public void beforeMethod(){
        System.out.println("before...");
    }
}
