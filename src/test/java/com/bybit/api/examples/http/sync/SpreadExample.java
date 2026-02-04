package com.bybit.api.examples.http.sync;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.spread.request.SpreadDataRequest;
import com.bybit.api.client.service.BybitApiClientFactory;

public class SpreadExample {
    public static void main(String[] args) {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newSpreadRestClient();

        // Get Spread Instruments Info
        System.out.println("=== Get Spread Instruments Info ===");
        var instrumentsRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(10).build();
        var instrumentsResult = client.getSpreadInstrumentsInfo(instrumentsRequest);
        System.out.println(instrumentsResult);

        // Get Spread Tickers (using valid spread symbol from instruments list)
        System.out.println("\n=== Get Spread Tickers ===");
        var tickersRequest = SpreadDataRequest.builder().spreadSymbol("BTCUSDT_BTC/USDT").build();
        var tickersResult = client.getSpreadTickers(tickersRequest);
        System.out.println(tickersResult);

        // Get Spread Orderbook (using valid spread symbol)
        System.out.println("\n=== Get Spread Orderbook ===");
        var orderbookRequest = SpreadDataRequest.builder().spreadSymbol("BTCUSDT_BTC/USDT").limit(25).build();
        var orderbookResult = client.getSpreadOrderbook(orderbookRequest);
        System.out.println(orderbookResult);

        // Get Spread Recent Trades (using valid spread symbol)
        System.out.println("\n=== Get Spread Recent Trades ===");
        var recentTradesRequest = SpreadDataRequest.builder().spreadSymbol("BTCUSDT_BTC/USDT").limit(10).build();
        var recentTradesResult = client.getSpreadRecentTrades(recentTradesRequest);
        System.out.println(recentTradesResult);

        // Get Spread Open Orders
        System.out.println("\n=== Get Spread Open Orders ===");
        var openOrdersRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        var openOrdersResult = client.getSpreadOpenOrders(openOrdersRequest);
        System.out.println(openOrdersResult);

        // Get Spread Order History
        System.out.println("\n=== Get Spread Order History ===");
        var orderHistoryRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        var orderHistoryResult = client.getSpreadOrderHistory(orderHistoryRequest);
        System.out.println(orderHistoryResult);

        // Get Spread Trade History
        System.out.println("\n=== Get Spread Trade History ===");
        var tradeHistoryRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        var tradeHistoryResult = client.getSpreadTradeHistory(tradeHistoryRequest);
        System.out.println(tradeHistoryResult);


    }
}
