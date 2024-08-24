package com.trading.stock.stockdata.mapper;

import com.trading.stock.stockdata.model.StockEntity;
import com.trading.stock.model.StockOverview;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StockTickerMapper {
    @Mapping(qualifiedByName  = "checkLength", source="description", target = "description")
    StockEntity sourceToDestination(StockOverview stockOverview);
    StockOverview destinationToSource(StockEntity  stockEntity);

    @Named("checkLength")
     default String checkLength(String description) {
        AtomicReference<String> descriptionVal = new AtomicReference<>(description);
         Optional.ofNullable(description).ifPresent(descriptionStr -> {
             if (descriptionStr.length() > 250) {
                 descriptionVal.set(descriptionStr.substring(0, 250));
             }
         });
         return descriptionVal.get();
     }
}
