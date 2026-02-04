package com.bybit.api.client.domain.spread.request;

import com.bybit.api.client.domain.trade.Side;
import com.bybit.api.client.domain.trade.TimeInForce;
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
public class SpreadOrderRequest {
    private String spreadSymbol;
    private Side side;
    private String orderType;
    private String qty;
    private String price;
    private TimeInForce timeInForce;
    private String orderId;
    private String orderLinkId;
}
