package com.OnlineMobileStore.service;

import com.OnlineMobileStore.entities.MobileModel;
import com.OnlineMobileStore.exception.MobileNotFoundException;
import com.OnlineMobileStore.repository.IMobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MobileService implements IMobileService{

    @Autowired
    IMobileRepository iMobileRepository;

    @Override
    public MobileModel addMobile(MobileModel mobile) {
        return iMobileRepository.save(mobile);
    }



    @Override
    public MobileModel updateMobile( MobileModel mobile) throws MobileNotFoundException {
        MobileModel mobileModel=iMobileRepository.findById(mobile.getMobileId());
        mobileModel.setMobileCost(mobile.getMobileCost());
        mobileModel.setMobileName(mobile.getMobileName());
        mobileModel.setModelNumber(mobile.getModelNumber());
        mobileModel.setCategory(mobile.getCategory());
        mobileModel.setCompanyName(mobile.getCompanyName());
        mobileModel.setMfd(mobile.getMfd());
        return iMobileRepository.save(mobileModel);
    }

    @Override
    public String deleteMobile(int id) throws MobileNotFoundException {
        iMobileRepository.deleteById(id);
        return "Mobile Deleted !"+ id;
    }

    @Override
    public List<MobileModel> showAllMobile() {
        return iMobileRepository.findAll();
    }

    @Override
    public MobileModel showMobileById(int mobileId) {
        return iMobileRepository.findById(mobileId);
    }
}
