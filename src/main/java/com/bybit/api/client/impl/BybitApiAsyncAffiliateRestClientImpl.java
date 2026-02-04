package com.bybit.api.client.impl;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;
import com.bybit.api.client.restApi.BybitApiAsyncAffiliateRestClient;
import com.bybit.api.client.restApi.BybitApiCallback;
import com.bybit.api.client.restApi.BybitApiService;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;

public class BybitApiAsyncAffiliateRestClientImpl implements BybitApiAsyncAffiliateRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiAsyncAffiliateRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public void getAffiliateUserList(AffiliateDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getAffiliateUserList(
                request.getUid(),
                request.getPage(),
                request.getSize()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }
}
