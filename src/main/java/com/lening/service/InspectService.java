package com.lening.service;

import com.lening.entity.Inspect;

import java.util.List;

public interface InspectService {
    List<Inspect> findOrderList(Inspect orderEntity);

    List<Inspect> findOtime();

    List<Inspect> findTimesection();

    List<Inspect> findSetmeal();

    void insertOrderAndUser(Inspect inspect);
}
