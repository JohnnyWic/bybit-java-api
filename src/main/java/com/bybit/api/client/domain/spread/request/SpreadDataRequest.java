package com.bybit.api.client.domain.spread.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpreadDataRequest {
    private String spreadSymbol;
    private String baseCoin;
    private String spreadType;
    private String direction;
    private String orderId;
    private String orderLinkId;
    private Long startTime;
    private Long endTime;
    private Integer limit;
    private String cursor;
}
