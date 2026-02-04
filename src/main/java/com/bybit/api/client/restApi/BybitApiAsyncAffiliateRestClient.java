package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;

public interface BybitApiAsyncAffiliateRestClient {

    void getAffiliateUserList(AffiliateDataRequest request, BybitApiCallback<Object> callback);
}
