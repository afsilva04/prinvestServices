package com.prinvest.prinvest.persistence;

import com.prinvest.prinvest.domain.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation, Long> {

    List<Operation> findAllByCoinContainingOrUserNameContaining(String coin, String user);
}
