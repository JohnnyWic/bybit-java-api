package com.bybit.api.client.domain.affiliate.request;

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
public class AffiliateDataRequest {
    private String uid;
    private Integer page;
    private Integer size;
}
