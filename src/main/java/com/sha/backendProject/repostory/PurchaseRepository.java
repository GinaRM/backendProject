package com.sha.backendProject.repostory;

import com.sha.backendProject.model.Purchase;
import com.sha.backendProject.repostory.projection.PurchaseBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    @Query("select " +
            "bsn.name as name " +
            "from Purchase pur left join Business bsn on bsn.id = pur.businessId " +
            "where pur.userId = :userId")

    List<PurchaseBusiness> findAllPurchasesOfUser(@Param("userId") Long userId);
}
