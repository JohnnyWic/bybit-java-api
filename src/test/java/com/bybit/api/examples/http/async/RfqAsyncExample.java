package com.bybit.api.examples.http.async;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.service.BybitApiClientFactory;

public class RfqAsyncExample {
    public static void main(String[] args) throws InterruptedException {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAsyncRfqRestClient();

        System.out.println("=== Get RFQ Config ===");
        client.getRfqConfig(System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get RFQ Realtime ===");
        var rfqRealtimeRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        client.getRfqRealtime(rfqRealtimeRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get RFQ History ===");
        var rfqHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        client.getRfqHistory(rfqHistoryRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Quotes Realtime ===");
        var quotesRealtimeRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        client.getQuotesRealtime(quotesRealtimeRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Quotes History ===");
        var quotesHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        client.getQuotesHistory(quotesHistoryRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get RFQ Trade History ===");
        var tradeHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        client.getRfqTradeHistory(tradeHistoryRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get RFQ Public Trades ===");
        var publicTradesRequest = RfqDataRequest.builder().baseCoin("BTC").category("option").limit(25).build();
        client.getRfqPublicTrades(publicTradesRequest, System.out::println);
        Thread.sleep(2000);
    }
}
