package com.solvd.kapinus.tests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.kapinus.unixtime.GetDateTimeMethod;
import com.solvd.kapinus.unixtime.GetUnixTimeStamp;
import com.solvd.kapinus.unixtime.PostDateTimeMethod;
import com.solvd.kapinus.unixtime.PostTimeStampMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APIUnixtimeTest extends AbstractTest {

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetDateTime() {
        GetDateTimeMethod getDateTime = new GetDateTimeMethod();
        getDateTime.callAPI();
        getDateTime.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testGetUnixTimeStamp() {
        GetUnixTimeStamp getUnixTimeStamp = new GetUnixTimeStamp();
        getUnixTimeStamp.callAPI();
        getUnixTimeStamp.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testCreateTimestamp() {
        PostTimeStampMethod postMethod = new PostTimeStampMethod();
        postMethod.callAPI();
        postMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    @MethodOwner(owner = "kapinus")
    public void testCreateDateTime() {
        PostDateTimeMethod postDateTime= new PostDateTimeMethod();
        postDateTime.callAPI();
        postDateTime.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

}
