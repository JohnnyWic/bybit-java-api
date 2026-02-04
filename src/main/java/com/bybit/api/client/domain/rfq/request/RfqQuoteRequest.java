package com.bybit.api.client.domain.rfq.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RfqQuoteRequest {
    private String rfqId;
    private String quoteId;
    private String quoteLinkId;
    private List<RfqLeg> legs;
    private String baseCoin;
}
