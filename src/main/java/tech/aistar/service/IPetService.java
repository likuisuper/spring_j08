package tech.aistar.service;


import tech.aistar.entity.Pet;

import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/9/16 4:50 下午
 */
public interface IPetService {
    List<Pet> findAll();
}
