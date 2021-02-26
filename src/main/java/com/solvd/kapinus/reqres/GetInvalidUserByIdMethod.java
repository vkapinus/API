package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetInvalidUserByIdMethod extends AbstractApiMethodV2 {
    public GetInvalidUserByIdMethod(int id){
        super(null, "api/users/_get/rs_invalid.json");
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }
}