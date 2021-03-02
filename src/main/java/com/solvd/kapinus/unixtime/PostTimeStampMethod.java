package com.solvd.kapinus.unixtime;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api.time/_post/rs.json")
@RequestTemplatePath(path = "api.time/_post/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@Endpoint(url = "${api_url}/UnixTime/fromunixtimestamp", methodType = HttpMethodType.POST)
public class PostTimeStampMethod extends AbstractApiMethodV2 {
    public PostTimeStampMethod (){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url2"));
    }
}
