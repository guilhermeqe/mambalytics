package com.mamba.mambalyticsapi.repository;

import com.mamba.mambalyticsapi.model.ContractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractEntityDAOInterface extends CrudRepository<ContractEntity, Long> {

}
