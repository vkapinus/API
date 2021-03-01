package com.solvd.kapinus.unixtime;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetDataTimyByTimeStamp extends AbstractApiMethodV2 {
    public GetDataTimyByTimeStamp(String timeStamp){
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url2"));
        addBodyParameterIfNotNull(timeStamp, timeStamp);

    }
}
