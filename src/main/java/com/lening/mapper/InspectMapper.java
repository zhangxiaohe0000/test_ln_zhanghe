package com.lening.mapper;

import com.lening.entity.Inspect;

import java.util.List;

public interface InspectMapper {
    List<Inspect> findOrderList(Inspect orderEntity);

    List<Inspect> findOtime();

    List<Inspect> findTimesection();

    List<Inspect> findSetmeal();

    void insertUser(Inspect inspect);

    void insertOrder(Inspect inspect);

    Inspect findOprice(Integer sid);
}
