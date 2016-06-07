package com.teemo.shrooms.repository;

import com.teemo.shrooms.dso.ReferenceData;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReferenceDataRepository extends PagingAndSortingRepository<ReferenceData, String> {

    List<ReferenceData> findBySetIdOrderByOrderAsc(String setId);

}
