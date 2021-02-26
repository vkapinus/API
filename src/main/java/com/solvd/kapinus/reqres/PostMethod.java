package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostMethod extends AbstractApiMethodV2 {
    public PostMethod(){
        super("api/users/_post/rq.json", "api/users/_post/rs.json");
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
    }
}