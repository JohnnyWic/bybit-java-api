package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;

public interface BybitApiAffiliateRestClient {

    Object getAffiliateUserList(AffiliateDataRequest request);
}
