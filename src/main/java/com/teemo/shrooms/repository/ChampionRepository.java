package com.teemo.shrooms.repository;

import com.teemo.shrooms.dso.Champion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionRepository extends CrudRepository<Champion, String> {


}