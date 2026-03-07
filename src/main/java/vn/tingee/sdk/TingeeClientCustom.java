package vn.tingee.sdk;

import vn.tingee.sdk.client.TingeeHttpClient;

public class TingeeClientCustom {

    private final TingeeHttpClient httpClient;

    public TingeeClientCustom(TingeeHttpClient httpClient) {
        this.httpClient = httpClient;
    }
}

