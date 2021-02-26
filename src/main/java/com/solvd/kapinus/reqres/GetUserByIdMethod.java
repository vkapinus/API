package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@ResponseTemplatePath(path = "api/users/_get/rs_by_id.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@Endpoint(url = "${api_url}/api/users/${id}", methodType = HttpMethodType.GET)
public class GetUserByIdMethod extends AbstractApiMethodV2 {
    public GetUserByIdMethod(int id){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}