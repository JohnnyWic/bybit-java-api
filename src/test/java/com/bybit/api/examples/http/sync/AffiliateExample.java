package com.bybit.api.examples.http.sync;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;
import com.bybit.api.client.service.BybitApiClientFactory;

public class AffiliateExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAffiliateRestClient();

        System.out.println("=== Get Affiliate User List ===");
        var request = AffiliateDataRequest.builder()
                .uid("123456")
                .page(1)
                .size(10)
                .build();
        var result = client.getAffiliateUserList(request);
        System.out.println(result);
    }
}
