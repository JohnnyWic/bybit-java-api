package com.bybit.api.client.domain.rfq.request;

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
public class RfqDataRequest {
    private String rfqId;
    private String rfqLinkId;
    private String quoteId;
    private String quoteLinkId;
    private String baseCoin;
    private String category;
    private Long startTime;
    private Long endTime;
    private Integer limit;
    private String cursor;
}
