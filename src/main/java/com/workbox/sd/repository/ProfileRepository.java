package com.workbox.sd.repository;

import com.workbox.sd.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

    @Query("select d from Profile d where d.typeOfProfile =:type")
    List<Profile> findAllByType(@Param(value="type") String type);

    Profile findByTypeOfProfile(String typeOfProfile);

    Profile findByDimensions(String dimensions);

    Profile findByWeight(double weight);

    Profile findByLength(double length);

    Profile findByGost(String gost);

}
