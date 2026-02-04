package com.bybit.api.examples.http.sync;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.domain.rfq.request.RfqLeg;
import com.bybit.api.client.domain.rfq.request.RfqQuoteRequest;
import com.bybit.api.client.domain.rfq.request.RfqRequest;
import com.bybit.api.client.domain.trade.Side;
import com.bybit.api.client.service.BybitApiClientFactory;

import java.util.Arrays;

public class RfqExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newRfqRestClient();

        System.out.println("=== Get RFQ Config ===");
        var configResult = client.getRfqConfig();
        System.out.println(configResult);

        System.out.println("\n=== Get RFQs Realtime ===");
        var rfqRealtimeRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        var rfqRealtimeResult = client.getRfqRealtime(rfqRealtimeRequest);
        System.out.println(rfqRealtimeResult);

        System.out.println("\n=== Get RFQ History ===");
        var rfqHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        var rfqHistoryResult = client.getRfqHistory(rfqHistoryRequest);
        System.out.println(rfqHistoryResult);

        System.out.println("\n=== Get Quotes Realtime ===");
        var quotesRealtimeRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        var quotesRealtimeResult = client.getQuotesRealtime(quotesRealtimeRequest);
        System.out.println(quotesRealtimeResult);

        System.out.println("\n=== Get Quotes History ===");
        var quotesHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        var quotesHistoryResult = client.getQuotesHistory(quotesHistoryRequest);
        System.out.println(quotesHistoryResult);

        System.out.println("\n=== Get RFQ Trade History ===");
        var tradeHistoryRequest = RfqDataRequest.builder().baseCoin("BTC").limit(25).build();
        var tradeHistoryResult = client.getRfqTradeHistory(tradeHistoryRequest);
        System.out.println(tradeHistoryResult);

        System.out.println("\n=== Get RFQ Public Trades ===");
        var publicTradesRequest = RfqDataRequest.builder().baseCoin("BTC").category("option").limit(25).build();
        var publicTradesResult = client.getRfqPublicTrades(publicTradesRequest);
        System.out.println(publicTradesResult);
    }
}
