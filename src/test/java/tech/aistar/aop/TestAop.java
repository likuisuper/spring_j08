package tech.aistar.aop;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/28 11:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop/spring-aop.xml"})
public class TestAop {
    @Autowired
    private IAOP iaop;


}
