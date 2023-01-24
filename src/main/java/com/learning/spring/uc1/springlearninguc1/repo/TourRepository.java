/**
 * 
 */
package com.learning.spring.uc1.springlearninguc1.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.learning.spring.uc1.springlearninguc1.domain.Tour;

/**
 * @author saritha
 *
 */

public interface TourRepository extends PagingAndSortingRepository<Tour,Integer>{
    
    @Override
    @RestResource(exported=false)
    default <S extends Tour> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @RestResource(exported=false)
    default <S extends Tour> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @RestResource(exported=false)
    default void delete(Tour entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    @RestResource(exported=false)
    default void deleteAll(Iterable<? extends Tour> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    @RestResource(exported=false)
    default void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    Page<Tour> findByTourPackageCode(@Param("code")String code,Pageable pageable);

}
