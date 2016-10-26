package com.workbox.sd.repository;

import com.workbox.sd.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

//    Rebar, LProfileEquilateral, LProfileNonEquilateral,
//    IBeamAdded, IBeamAngle, IBeamCol, IBeamNorm, IBeamWide,
//    TBeamCol, TBeamWide, SquarePipe, RectangularPipe, CirclePipe,
//    ChanelAngle, ChanelBend, ChanelParalel

   /* @Query("select d from profile d where d.type ='LProfileNonEquilateral'")
    List<Profile> findAllLProfileNonEquilateral();

    @Query("select d from Profile d where d.type ='Rebar'")
    List<Profile> findAllRebar();

    @Query("select d from Profile d where d.type ='LProfileEquilateral'")
    List<Profile> findAllLProfileEquilateral();

    @Query("select d from Profile d where d.type ='IBeamAngle'")
    List<Profile> findAllIBeamAngle();

    @Query("select d from Profile d where d.type ='IBeamCol'")
    List<Profile> findAllIBeamCol();

    @Query("select d from Profile d where d.type ='IBeamNorm'")
    List<Profile> findAllIBeamNorm();

    @Query("select d from Profile d where d.type ='IBeamWide'")
    List<Profile> findAllIBeamWide();

    @Query("select d from Profile d where d.type ='TBeamWide'")
    List<Profile> findAllTBeamWide();

    @Query("select d from Profile d where d.type ='TBeamCol'")
    List<Profile> findAllTBeamCol();

    @Query("select d from Profile d where d.type ='IBeamAdded'")
    List<Profile> findAllIBeamAdded();

    @Query("select d from Profile d where d.type ='SquarePipe'")
    List<Profile> findAllSquarePipe();

    @Query("select d from Profile d where d.type ='RectangularPipe'")
    List<Profile> findAllRectangularPipe();

    @Query("select d from Profile d where d.type ='CirclePipe'")
    List<Profile> findAllCirclePipe();

    @Query("select d from Profile d where d.type ='ChanelAngle'")
    List<Profile> findAllChanelAngle();

    @Query("select d from Profile d where d.type ='ChanelBend'")
    List<Profile> findAllChanelBend();

    @Query("select d from Profile d where d.type ='ChanelParalel'")
    List<Profile> findAllChanelParalel();*/

}
