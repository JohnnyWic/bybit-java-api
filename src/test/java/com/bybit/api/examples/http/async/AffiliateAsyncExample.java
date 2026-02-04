package com.bybit.api.examples.http.async;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.affiliate.request.AffiliateDataRequest;
import com.bybit.api.client.service.BybitApiClientFactory;

public class AffiliateAsyncExample {
    public static void main(String[] args) throws InterruptedException {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAsyncAffiliateRestClient();

        System.out.println("=== Get Affiliate User List ===");
        var request = AffiliateDataRequest.builder()
                .uid("123456")
                .page(1)
                .size(10)
                .build();
        client.getAffiliateUserList(request, System.out::println);
        Thread.sleep(2000);
    }
}
