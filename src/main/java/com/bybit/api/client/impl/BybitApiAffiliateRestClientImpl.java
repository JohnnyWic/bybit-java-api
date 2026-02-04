package com.bybit.api.client.impl;

import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;
import com.bybit.api.client.restApi.BybitApiAffiliateRestClient;
import com.bybit.api.client.restApi.BybitApiService;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;
import static com.bybit.api.client.service.BybitApiServiceGenerator.executeSync;

public class BybitApiAffiliateRestClientImpl implements BybitApiAffiliateRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiAffiliateRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public Object getAffiliateUserList(AffiliateDataRequest request) {
        return executeSync(bybitApiService.getAffiliateUserList(
                request.getUid(),
                request.getPage(),
                request.getSize()
        ));
    }
}
