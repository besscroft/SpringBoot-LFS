package com.besscroft.lfs.service.impl;

import com.besscroft.lfs.model.RoleResourceRelation;
import com.besscroft.lfs.repository.RoleResourceRelationRepository;
import com.besscroft.lfs.service.RoleResourceRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Bess Croft
 * @Time 2021/7/8 18:17
 */
@Service
public class RoleResourceRelationImpl implements RoleResourceRelationService {

    @Autowired
    private RoleResourceRelationRepository roleResourceRelationRepository;

    @Override
    public List<RoleResourceRelation> selectAll() {
        return roleResourceRelationRepository.findAll();
    }

}
