package com.OnlineMobileStore.repository;

import com.OnlineMobileStore.entities.MobileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMobileRepository extends JpaRepository<MobileModel,Integer> {
    public MobileModel findById(int mobileId);
}
