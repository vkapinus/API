package com.solvd.kapinus.tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.kapinus.reqres.*;
import io.restassured.path.json.JsonPath;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;


public class APIReqresTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetUserById() {
        int id = 1;
        GetUserByIdMethod getUserByIdMethod = new GetUserByIdMethod(id);
        getUserByIdMethod.callAPIExpectSuccess();
        getUserByIdMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testCreateUser() {
        PostMethod postMethod = new PostMethod();
        postMethod.callAPIExpectSuccess();
        postMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetInvalidUserById() {
        int id = 23;
        GetInvalidUserByIdMethod getInvalidUserByIdMethod = new GetInvalidUserByIdMethod(id);
        getInvalidUserByIdMethod.callAPI();
        getInvalidUserByIdMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test(description = "JIRA#DEMO-0003")
    @MethodOwner(owner = "kapinus")
    public void testDeletePost() {
        int id = 1;
        DeleteUserByIdMethod deleteUserById = new DeleteUserByIdMethod(id);
        deleteUserById.callAPI();
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetUsers() {
        GetUsersMethod getUsers = new GetUsersMethod();
        getUsers.callAPI();
        getUsers.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testLoginUser() {
        LoginUserMethod loginUser = new LoginUserMethod();
        loginUser.callAPIExpectSuccess();
        loginUser.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }


    @Test
    @MethodOwner(owner = "kapinus")
    public void testGroupPostGet() {
        PostMethod postMethod = new PostMethod();
        String rs = postMethod.callAPIExpectSuccess().asString();
        postMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        String id = new JsonPath(rs).getString("id");
        GetUserByIdMethod getUserByIdMethod = new GetUserByIdMethod(Integer.parseInt(id));
        getUserByIdMethod.callAPI();
        getUserByIdMethod.validateResponse();
    }
}