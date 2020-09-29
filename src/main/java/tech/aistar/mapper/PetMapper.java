package tech.aistar.mapper;


import org.apache.ibatis.annotations.Select;
import tech.aistar.entity.Pet;

import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: cxylk
 * @date: 2020/9/16 4:48 下午
 */
public interface PetMapper {

    @Select("select * from pet")
    List<Pet> findAll();
}
