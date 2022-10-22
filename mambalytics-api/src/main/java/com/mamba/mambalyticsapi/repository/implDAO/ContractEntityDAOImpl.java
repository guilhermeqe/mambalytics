package com.mamba.mambalyticsapi.repository.implDAO;

import com.mamba.mambalyticsapi.model.ContractEntity;
import com.mamba.mambalyticsapi.repository.ContractEntityDAOInterface;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ContractEntityDAOImpl implements ContractEntityDAOInterface {


    @Override
    public <S extends ContractEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ContractEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ContractEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ContractEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ContractEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ContractEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ContractEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
