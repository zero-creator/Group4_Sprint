package com.OnlineMobileStore.service;

import com.OnlineMobileStore.entities.MobileModel;
import com.OnlineMobileStore.exception.MobileNotFoundException;

import java.util.List;
import java.util.Map;

public interface IMobileService {
    public MobileModel addMobile(MobileModel mobile);
    public MobileModel updateMobile(MobileModel mobile) throws MobileNotFoundException;
    public String deleteMobile(int id) throws MobileNotFoundException;
    public List<MobileModel> showAllMobile();
    public MobileModel showMobileById(int mobileId);
}
