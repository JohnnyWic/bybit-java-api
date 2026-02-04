package com.bybit.api.client.impl;

import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.domain.rfq.request.RfqLeg;
import com.bybit.api.client.domain.rfq.request.RfqQuoteRequest;
import com.bybit.api.client.domain.rfq.request.RfqRequest;
import com.bybit.api.client.restApi.BybitApiAsyncRfqRestClient;
import com.bybit.api.client.restApi.BybitApiCallback;
import com.bybit.api.client.restApi.BybitApiService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;

public class BybitApiAsyncRfqRestClientImpl implements BybitApiAsyncRfqRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiAsyncRfqRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public void createRfq(RfqRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        if (request.getLegs() != null) {
            params.put("legs", convertLegsToMap(request.getLegs()));
        }
        if (request.getCounterparties() != null) {
            params.put("counterparties", request.getCounterparties());
        }
        if (request.getRfqLinkId() != null) {
            params.put("rfqLinkId", request.getRfqLinkId());
        }
        bybitApiService.createRfq(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void createRfq(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.createRfq(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getRfqConfig(BybitApiCallback<Object> callback) {
        bybitApiService.getRfqConfig().enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelRfq(RfqRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        if (request.getRfqId() != null) {
            params.put("rfqId", request.getRfqId());
        }
        if (request.getRfqLinkId() != null) {
            params.put("rfqLinkId", request.getRfqLinkId());
        }
        bybitApiService.cancelRfq(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelRfq(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.cancelRfq(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelAllRfq(RfqRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        if (request.getBaseCoin() != null) {
            params.put("baseCoin", request.getBaseCoin());
        }
        bybitApiService.cancelAllRfq(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelAllRfq(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.cancelAllRfq(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void createRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        params.put("rfqId", request.getRfqId());
        if (request.getLegs() != null) {
            params.put("legs", convertLegsToMap(request.getLegs()));
        }
        if (request.getQuoteLinkId() != null) {
            params.put("quoteLinkId", request.getQuoteLinkId());
        }
        bybitApiService.createRfqQuote(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void createRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.createRfqQuote(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void executeRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        params.put("rfqId", request.getRfqId());
        params.put("quoteId", request.getQuoteId());
        bybitApiService.executeRfqQuote(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void executeRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.executeRfqQuote(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelRfqQuote(RfqQuoteRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        if (request.getQuoteId() != null) {
            params.put("quoteId", request.getQuoteId());
        }
        if (request.getQuoteLinkId() != null) {
            params.put("quoteLinkId", request.getQuoteLinkId());
        }
        bybitApiService.cancelRfqQuote(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelRfqQuote(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.cancelRfqQuote(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelAllRfqQuotes(RfqQuoteRequest request, BybitApiCallback<Object> callback) {
        Map<String, Object> params = new HashMap<>();
        if (request.getBaseCoin() != null) {
            params.put("baseCoin", request.getBaseCoin());
        }
        bybitApiService.cancelAllRfqQuotes(params).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void cancelAllRfqQuotes(Map<String, Object> request, BybitApiCallback<Object> callback) {
        bybitApiService.cancelAllRfqQuotes(request).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getRfqRealtime(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getRfqRealtime(
                request.getRfqId(),
                request.getRfqLinkId(),
                request.getBaseCoin(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getRfqHistory(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getRfqHistory(
                request.getRfqId(),
                request.getRfqLinkId(),
                request.getBaseCoin(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getQuotesRealtime(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getQuotesRealtime(
                request.getQuoteId(),
                request.getQuoteLinkId(),
                request.getBaseCoin(),
                request.getRfqId(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getQuotesHistory(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getQuotesHistory(
                request.getQuoteId(),
                request.getQuoteLinkId(),
                request.getBaseCoin(),
                request.getRfqId(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getRfqTradeHistory(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getRfqTradeHistory(
                request.getBaseCoin(),
                request.getRfqId(),
                request.getQuoteId(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    @Override
    public void getRfqPublicTrades(RfqDataRequest request, BybitApiCallback<Object> callback) {
        bybitApiService.getRfqPublicTrades(
                request.getBaseCoin(),
                request.getCategory(),
                request.getLimit(),
                request.getCursor()
        ).enqueue(new BybitApiCallbackAdapter<>(callback));
    }

    private List<Map<String, Object>> convertLegsToMap(List<RfqLeg> legs) {
        List<Map<String, Object>> result = new ArrayList<>();
        for (RfqLeg leg : legs) {
            Map<String, Object> legMap = new HashMap<>();
            legMap.put("symbol", leg.getSymbol());
            if (leg.getSide() != null) {
                legMap.put("side", leg.getSide().getTransactionSide());
            }
            legMap.put("qty", leg.getQty());
            if (leg.getPrice() != null) {
                legMap.put("price", leg.getPrice());
            }
            result.add(legMap);
        }
        return result;
    }
}
