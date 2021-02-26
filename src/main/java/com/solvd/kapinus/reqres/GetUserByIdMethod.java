package com.solvd.kapinus.reqres;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetUserByIdMethod extends AbstractApiMethodV2 {
    public GetUserByIdMethod(int id){
        super(null, "api/users/_get/rs_by_id.json");
        replaceUrlPlaceholder("api_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(id));
    }

}