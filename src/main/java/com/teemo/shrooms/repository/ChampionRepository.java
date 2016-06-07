package com.teemo.shrooms.repository;

import com.teemo.shrooms.dso.Champion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionRepository extends PagingAndSortingRepository<Champion, String> {


}