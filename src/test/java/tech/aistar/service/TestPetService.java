package tech.aistar.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.aistar.mapper.PetMapper;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/9/27 3:44 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application/spring-*.xml"} )
public class TestPetService {

    @Autowired
    private IPetService petService;

    @Autowired
    private PetMapper petMapper;

    @Test
    public void testFind(){
        System.out.println(petService.findAll());
    }

    @Test
    public void testMapperFind(){
        System.out.println(petMapper.findAll());
    }
}
