package com.solvd.kapinus.tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.kapinus.coinpaprika.GetCoinsMethod;
import com.solvd.kapinus.coinpaprika.GetMarketMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APICoinpaprikaTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetMarket() {
        GetMarketMethod getMarket = new GetMarketMethod();
        getMarket.callAPI();
        getMarket.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetCoins() {
        GetCoinsMethod getCoins = new GetCoinsMethod();
        getCoins.callAPI();
        getCoins.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}
