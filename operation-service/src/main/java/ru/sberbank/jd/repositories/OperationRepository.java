package ru.sberbank.jd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sberbank.jd.entities.Operation;

import java.util.List;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
        public List<Operation> findByCreditAccountOrDebitAccount(String creditAccountId,String debitAccountId);
}