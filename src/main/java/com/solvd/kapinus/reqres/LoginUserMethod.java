package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api/users/_post/rs_login.json")
@RequestTemplatePath(path = "api/users/_post/rq_login.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@Endpoint(url = "${api_url}/api/login", methodType = HttpMethodType.POST)
public class LoginUserMethod extends AbstractApiMethodV2 {
    public LoginUserMethod(){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
    }
}
