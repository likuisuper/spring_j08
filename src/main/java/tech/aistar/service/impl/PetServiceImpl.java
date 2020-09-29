package tech.aistar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.aistar.entity.Pet;
import tech.aistar.mapper.PetMapper;
import tech.aistar.service.IPetService;

import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/9/16 4:50 下午
 */
@Service
public class PetServiceImpl implements IPetService {

    @Autowired
    private PetMapper petMapper;

    @Override
    public List<Pet> findAll() {

        return petMapper.findAll();
    }

}