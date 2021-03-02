package com.solvd.kapinus.unixtime;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api.time/_post/rs_time.json")
@RequestTemplatePath(path = "api.time/_post/rq_time.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@Endpoint(url = "${api_url}/UnixTime/tounixtimestamp", methodType = HttpMethodType.POST)
public class PostDateTimeMethod extends AbstractApiMethodV2 {
    public PostDateTimeMethod (){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url2"));
    }
}