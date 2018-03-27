package com.chouqian.chouqian.service;

import com.chouqian.chouqian.entity.MobileEntity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Danny on 2018/2/13.
 */
public interface IMobileService {
    Page<MobileEntity> findAll(Integer page, Integer limit);

    List<MobileEntity> findAll();

    List<MobileEntity> create(List<String> number);

    boolean del(List<Integer> id);
}
