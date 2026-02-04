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
public class RfqRequest {
    private List<RfqLeg> legs;
    private List<String> counterparties;
    private String rfqId;
    private String rfqLinkId;
    private String baseCoin;
}
