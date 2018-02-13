package com.chouqian.chouqian.service;

import com.chouqian.chouqian.entity.MobileEntity;

import java.util.List;

/**
 * Created by Danny on 2018/2/13.
 */
public interface IMobileService {
    List<MobileEntity> findAll();

    List<MobileEntity> create(List<String> number);

    boolean del(List<Integer> id);
}
