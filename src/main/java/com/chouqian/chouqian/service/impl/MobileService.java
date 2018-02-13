package com.chouqian.chouqian.service.impl;

import com.chouqian.chouqian.entity.MobileEntity;
import com.chouqian.chouqian.repository.IMobileRepository;
import com.chouqian.chouqian.service.IMobileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danny on 2018/2/13.
 */
@Service
public class MobileService implements IMobileService {
    @Resource
    private IMobileRepository iMobileRepository;

    @Override
    public List<MobileEntity> findAll() {
        return iMobileRepository.findAll();
    }

    @Override
    public List<MobileEntity> create(List<String> number) {
        MobileEntity mobileEntity;
        List<MobileEntity> list=new ArrayList<>();
        for (String number1:number){
            mobileEntity=new MobileEntity();
            mobileEntity.setNumber(number1);
            list.add(mobileEntity);
        }
        return iMobileRepository.save(list);
    }

    @Override
    public boolean del(List<Integer> id) {
        List<MobileEntity> list=iMobileRepository.findAll(id);
        iMobileRepository.delete(list);
        return true;
    }
}
