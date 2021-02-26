package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.*;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api/users/_post/rs.json")
@RequestTemplatePath(path = "api/users/_post/rq.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@Endpoint(url = "${api_url}/api/users", methodType = HttpMethodType.POST)
public class PostMethod extends AbstractApiMethodV2 {
    public PostMethod(){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
    }
}