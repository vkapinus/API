package com.solvd.kapinus.gorest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@SuccessfulHttpStatus(status = HttpResponseStatusType.NO_CONTENT_204)
@Endpoint(url = "${api_url}/public-api/users/${id}", methodType = HttpMethodType.DELETE)
public class DeleteUserGorestByIdMethod extends AbstractApiMethodV2 {
    public DeleteUserGorestByIdMethod(int id) {
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url3"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}