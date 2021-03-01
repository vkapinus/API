package com.solvd.kapinus.coinpaprika;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api.coin/_get/rs_coin.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@Endpoint(url = "${api_url}/v1/coins", methodType = HttpMethodType.GET)
public class GetCoinsMethod extends AbstractApiMethodV2 {
    public GetCoinsMethod(){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url1"));
    }
}