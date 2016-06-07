package com.teemo.shrooms.service;


import com.teemo.shrooms.dso.ReferenceData;
import com.teemo.shrooms.repository.ReferenceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceDataServiceImpl extends BaseServiceImpl<ReferenceData, ReferenceDataRepository> implements ReferenceDataService{

    @Autowired
    public ReferenceDataServiceImpl(ReferenceDataRepository repository) {
        super(repository);
    }

    @Override
    public List<ReferenceData> getReferenceDataBySetId(String setId){
        return getRepository().findBySetIdOrderByOrderAsc(setId);
    }

}
