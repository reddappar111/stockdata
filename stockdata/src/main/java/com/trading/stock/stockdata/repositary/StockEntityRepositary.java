package com.trading.stock.stockdata.repositary;

import com.trading.stock.stockdata.model.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockEntityRepositary extends JpaRepository<StockEntity, String> {
}
