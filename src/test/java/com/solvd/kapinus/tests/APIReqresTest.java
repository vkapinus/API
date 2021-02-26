package com.solvd.kapinus.tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.kapinus.reqres.GetInvalidUserByIdMethod;
import com.solvd.kapinus.reqres.GetUserByIdMethod;
import com.solvd.kapinus.reqres.PostMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;


public class APIReqresTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetUserById() {
        int id = 1;
        GetUserByIdMethod getUserByIdMethod = new GetUserByIdMethod(id);
        getUserByIdMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserByIdMethod.callAPI();
        getUserByIdMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testCreateUser() {
        PostMethod postMethod = new PostMethod();
        postMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postMethod.callAPI();
        postMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetInvalidUserById() {
        int id = 23;
        GetInvalidUserByIdMethod getInvalidUserByIdMethod = new GetInvalidUserByIdMethod(id);
        getInvalidUserByIdMethod.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
        getInvalidUserByIdMethod.callAPI();
        getInvalidUserByIdMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}