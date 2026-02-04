package com.bybit.api.client.restApi;

import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.domain.rfq.request.RfqQuoteRequest;
import com.bybit.api.client.domain.rfq.request.RfqRequest;

import java.util.Map;

public interface BybitApiRfqRestClient {

    Object createRfq(RfqRequest request);
    Object createRfq(Map<String, Object> request);
    Object getRfqConfig();
    Object cancelRfq(RfqRequest request);
    Object cancelRfq(Map<String, Object> request);
    Object cancelAllRfq(RfqRequest request);
    Object cancelAllRfq(Map<String, Object> request);

    Object createRfqQuote(RfqQuoteRequest request);
    Object createRfqQuote(Map<String, Object> request);
    Object executeRfqQuote(RfqQuoteRequest request);
    Object executeRfqQuote(Map<String, Object> request);
    Object cancelRfqQuote(RfqQuoteRequest request);
    Object cancelRfqQuote(Map<String, Object> request);
    Object cancelAllRfqQuotes(RfqQuoteRequest request);
    Object cancelAllRfqQuotes(Map<String, Object> request);

    Object getRfqRealtime(RfqDataRequest request);
    Object getRfqHistory(RfqDataRequest request);
    Object getQuotesRealtime(RfqDataRequest request);
    Object getQuotesHistory(RfqDataRequest request);
    Object getRfqTradeHistory(RfqDataRequest request);
    Object getRfqPublicTrades(RfqDataRequest request);
}
