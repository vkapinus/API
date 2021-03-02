package com.solvd.kapinus.unixtime;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api.time/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@Endpoint(url = "${api_url}/UnixTime/fromunixtimestamp?unixtimestamp=1549892280", methodType = HttpMethodType.GET)
public class GetDateTimeMethod extends AbstractApiMethodV2 {
    public GetDateTimeMethod() {
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url2"));
    }
}
