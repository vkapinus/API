package com.solvd.kapinus.tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.kapinus.gorest.DeleteUserGorestByIdMethod;
import com.solvd.kapinus.gorest.GetUserByIdMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APIGorestTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetUserById() {
        int id = 2;
        GetUserByIdMethod getUserByIdMethod = new GetUserByIdMethod(id);
        getUserByIdMethod.callAPI();
        getUserByIdMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test(description = "JIRA#DEMO-0003")
    @MethodOwner(owner = "kapinus")
    public void testDeleteUser() {
        int id = 2;
        DeleteUserGorestByIdMethod deleteUserById = new DeleteUserGorestByIdMethod(id);
        deleteUserById.callAPI();
    }


}
