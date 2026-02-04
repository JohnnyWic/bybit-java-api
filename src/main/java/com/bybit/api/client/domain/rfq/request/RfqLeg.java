package com.bybit.api.client.domain.rfq.request;

import com.bybit.api.client.domain.trade.Side;
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
public class RfqLeg {
    private String symbol;
    private Side side;
    private String qty;
    private String price;
}
