package com.bybit.api.examples.http.async;

import com.bybit.api.client.config.BybitApiConfig;
import com.bybit.api.client.domain.spread.request.SpreadDataRequest;
import com.bybit.api.client.service.BybitApiClientFactory;

public class SpreadAsyncExample {
    public static void main(String[] args) throws InterruptedException {
        var client = BybitApiClientFactory.newInstance("YOUR_API_KEY", "YOUR_API_SECRET", BybitApiConfig.TESTNET_DOMAIN).newAsyncSpreadRestClient();

        System.out.println("=== Get Spread Instruments Info ===");
        var instrumentsRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(10).build();
        client.getSpreadInstrumentsInfo(instrumentsRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Spread Tickers ===");
        var tickersRequest = SpreadDataRequest.builder().spreadSymbol("BTCUSDT_BTC/USDT").build();
        client.getSpreadTickers(tickersRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Spread Recent Trades ===");
        var recentTradesRequest = SpreadDataRequest.builder().spreadSymbol("BTCUSDT_BTC/USDT").limit(10).build();
        client.getSpreadRecentTrades(recentTradesRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Spread Open Orders ===");
        var openOrdersRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        client.getSpreadOpenOrders(openOrdersRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Spread Order History ===");
        var orderHistoryRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        client.getSpreadOrderHistory(orderHistoryRequest, System.out::println);
        Thread.sleep(2000);

        System.out.println("\n=== Get Spread Trade History ===");
        var tradeHistoryRequest = SpreadDataRequest.builder().baseCoin("BTC").limit(20).build();
        client.getSpreadTradeHistory(tradeHistoryRequest, System.out::println);
        Thread.sleep(2000);
    }
}
