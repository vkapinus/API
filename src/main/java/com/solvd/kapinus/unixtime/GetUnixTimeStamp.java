package com.solvd.kapinus.unixtime;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;


@ResponseTemplatePath(path = "api.time/_get/rs_time.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@Endpoint(url = "${api_url}/UnixTime/tounixtimestamp?datetime=now", methodType = HttpMethodType.GET)
public class GetUnixTimeStamp extends AbstractApiMethodV2 {
    public GetUnixTimeStamp() {
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url2"));
    }
}