package com.lening.service.impl;

import com.lening.entity.Inspect;
import com.lening.mapper.InspectMapper;
import com.lening.service.InspectService;
import com.lening.utils.GetId;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InspectServiceImpl implements InspectService {

    @Resource
    private InspectMapper inspectMapper;

    @Override
    public List<Inspect> findOrderList(Inspect orderEntity) {
        return inspectMapper.findOrderList(orderEntity);
    }

    @Override
    public List<Inspect> findOtime() {
        return inspectMapper.findOtime();
    }

    @Override
    public List<Inspect> findTimesection() {
        return inspectMapper.findTimesection();
    }

    @Override
    public List<Inspect> findSetmeal() {
        return inspectMapper.findSetmeal();
    }

    @Override
    public void insertOrderAndUser(Inspect inspect) {
        String id = GetId.getId();
        inspect.setUid(id);
        inspectMapper.insertUser(inspect);
        String uid = inspect.getUid();
        inspect.setUid(uid);
        inspectMapper.insertOrder(inspect);
    }
}
