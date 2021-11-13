package com.rkm.loganalyser.loganalyser.repository;

import com.rkm.loganalyser.loganalyser.model.persistence.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
