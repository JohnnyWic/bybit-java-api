package com.bybit.api.client.impl;

import com.bybit.api.client.domain.rfq.request.RfqDataRequest;
import com.bybit.api.client.domain.rfq.request.RfqLeg;
import com.bybit.api.client.domain.rfq.request.RfqQuoteRequest;
import com.bybit.api.client.domain.rfq.request.RfqRequest;
import com.bybit.api.client.restApi.BybitApiRfqRestClient;
import com.bybit.api.client.restApi.BybitApiService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bybit.api.client.service.BybitApiServiceGenerator.createService;
import static com.bybit.api.client.service.BybitApiServiceGenerator.executeSync;

public class BybitApiRfqRestClientImpl implements BybitApiRfqRestClient {
    private final BybitApiService bybitApiService;

    public BybitApiRfqRestClientImpl(String apiKey, String secret, String baseUrl, boolean debugMode, long recvWindow, String logOption, String referer) {
        bybitApiService = createService(BybitApiService.class, apiKey, secret, baseUrl, debugMode, recvWindow, logOption, referer);
    }

    @Override
    public Object createRfq(RfqRequest request) {
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
        return executeSync(bybitApiService.createRfq(params));
    }

    @Override
    public Object createRfq(Map<String, Object> request) {
        return executeSync(bybitApiService.createRfq(request));
    }

    @Override
    public Object getRfqConfig() {
        return executeSync(bybitApiService.getRfqConfig());
    }

    @Override
    public Object cancelRfq(RfqRequest request) {
        Map<String, Object> params = new HashMap<>();
        if (request.getRfqId() != null) {
            params.put("rfqId", request.getRfqId());
        }
        if (request.getRfqLinkId() != null) {
            params.put("rfqLinkId", request.getRfqLinkId());
        }
        return executeSync(bybitApiService.cancelRfq(params));
    }

    @Override
    public Object cancelRfq(Map<String, Object> request) {
        return executeSync(bybitApiService.cancelRfq(request));
    }

    @Override
    public Object cancelAllRfq(RfqRequest request) {
        Map<String, Object> params = new HashMap<>();
        if (request.getBaseCoin() != null) {
            params.put("baseCoin", request.getBaseCoin());
        }
        return executeSync(bybitApiService.cancelAllRfq(params));
    }

    @Override
    public Object cancelAllRfq(Map<String, Object> request) {
        return executeSync(bybitApiService.cancelAllRfq(request));
    }

    @Override
    public Object createRfqQuote(RfqQuoteRequest request) {
        Map<String, Object> params = new HashMap<>();
        params.put("rfqId", request.getRfqId());
        if (request.getLegs() != null) {
            params.put("legs", convertLegsToMap(request.getLegs()));
        }
        if (request.getQuoteLinkId() != null) {
            params.put("quoteLinkId", request.getQuoteLinkId());
        }
        return executeSync(bybitApiService.createRfqQuote(params));
    }

    @Override
    public Object createRfqQuote(Map<String, Object> request) {
        return executeSync(bybitApiService.createRfqQuote(request));
    }

    @Override
    public Object executeRfqQuote(RfqQuoteRequest request) {
        Map<String, Object> params = new HashMap<>();
        params.put("rfqId", request.getRfqId());
        params.put("quoteId", request.getQuoteId());
        return executeSync(bybitApiService.executeRfqQuote(params));
    }

    @Override
    public Object executeRfqQuote(Map<String, Object> request) {
        return executeSync(bybitApiService.executeRfqQuote(request));
    }

    @Override
    public Object cancelRfqQuote(RfqQuoteRequest request) {
        Map<String, Object> params = new HashMap<>();
        if (request.getQuoteId() != null) {
            params.put("quoteId", request.getQuoteId());
        }
        if (request.getQuoteLinkId() != null) {
            params.put("quoteLinkId", request.getQuoteLinkId());
        }
        return executeSync(bybitApiService.cancelRfqQuote(params));
    }

    @Override
    public Object cancelRfqQuote(Map<String, Object> request) {
        return executeSync(bybitApiService.cancelRfqQuote(request));
    }

    @Override
    public Object cancelAllRfqQuotes(RfqQuoteRequest request) {
        Map<String, Object> params = new HashMap<>();
        if (request.getBaseCoin() != null) {
            params.put("baseCoin", request.getBaseCoin());
        }
        return executeSync(bybitApiService.cancelAllRfqQuotes(params));
    }

    @Override
    public Object cancelAllRfqQuotes(Map<String, Object> request) {
        return executeSync(bybitApiService.cancelAllRfqQuotes(request));
    }

    @Override
    public Object getRfqRealtime(RfqDataRequest request) {
        return executeSync(bybitApiService.getRfqRealtime(
                request.getRfqId(),
                request.getRfqLinkId(),
                request.getBaseCoin(),
                request.getLimit(),
                request.getCursor()
        ));
    }

    @Override
    public Object getRfqHistory(RfqDataRequest request) {
        return executeSync(bybitApiService.getRfqHistory(
                request.getRfqId(),
                request.getRfqLinkId(),
                request.getBaseCoin(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ));
    }

    @Override
    public Object getQuotesRealtime(RfqDataRequest request) {
        return executeSync(bybitApiService.getQuotesRealtime(
                request.getQuoteId(),
                request.getQuoteLinkId(),
                request.getBaseCoin(),
                request.getRfqId(),
                request.getLimit(),
                request.getCursor()
        ));
    }

    @Override
    public Object getQuotesHistory(RfqDataRequest request) {
        return executeSync(bybitApiService.getQuotesHistory(
                request.getQuoteId(),
                request.getQuoteLinkId(),
                request.getBaseCoin(),
                request.getRfqId(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ));
    }

    @Override
    public Object getRfqTradeHistory(RfqDataRequest request) {
        return executeSync(bybitApiService.getRfqTradeHistory(
                request.getBaseCoin(),
                request.getRfqId(),
                request.getQuoteId(),
                request.getStartTime(),
                request.getEndTime(),
                request.getLimit(),
                request.getCursor()
        ));
    }

    @Override
    public Object getRfqPublicTrades(RfqDataRequest request) {
        return executeSync(bybitApiService.getRfqPublicTrades(
                request.getBaseCoin(),
                request.getCategory(),
                request.getLimit(),
                request.getCursor()
        ));
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
