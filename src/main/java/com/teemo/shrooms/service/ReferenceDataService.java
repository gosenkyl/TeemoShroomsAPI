package com.teemo.shrooms.service;

import com.teemo.shrooms.dso.ReferenceData;

import java.util.List;

public interface ReferenceDataService extends BaseService<ReferenceData>{

    List<ReferenceData> getReferenceDataBySetId(String setId);

}
