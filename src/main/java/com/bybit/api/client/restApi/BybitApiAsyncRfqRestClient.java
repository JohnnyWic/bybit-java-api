package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.domain.rfq.request.RfqQuoteRequest;
import com.bybit.api.client.domain.rfq.request.RfqRequest;

import java.util.Map;

public interface BybitApiAsyncRfqRestClient {

    void createRfq(RfqRequest request, BybitApiCallback<Object> callback);
    void createRfq(Map<String, Object> request, BybitApiCallback<Object> callback);
    void getRfqConfig(BybitApiCallback<Object> callback);
    void cancelRfq(RfqRequest request, BybitApiCallback<Object> callback);
    void cancelRfq(Map<String, Object> request, BybitApiCallback<Object> callback);
    void cancelAllRfq(RfqRequest request, BybitApiCallback<Object> callback);
    void cancelAllRfq(Map<String, Object> request, BybitApiCallback<Object> callback);

    void createRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback);
    void createRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback);
    void executeRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback);
    void executeRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback);
    void cancelRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback);
    void cancelRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback);
    void cancelAllRfqQuotes(RfqQuoteRequest request, BybitApiCallback<Object> callback);
    void cancelAllRfqQuotes(Map<String, Object> request, BybitApiCallback<Object> callback);

    void getRfqRealtime(RfqDataRequest request, BybitApiCallback<Object> callback);
    void getRfqHistory(RfqDataRequest request, BybitApiCallback<Object> callback);
    void getQuotesRealtime(RfqDataRequest request, BybitApiCallback<Object> callback);
    void getQuotesHistory(RfqDataRequest request, BybitApiCallback<Object> callback);
    void getRfqTradeHistory(RfqDataRequest request, BybitApiCallback<Object> callback);
    void getRfqPublicTrades(RfqDataRequest request, BybitApiCallback<Object> callback);
}
