package com.example.deepshah.headytest;


import com.example.deepshah.headytest.model.GuardianClass;
import com.example.deepshah.headytest.model.Result;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "http://api.nytimes.com/";
    @GET("svc/{topstories}/{v2}/{home}.json")
    Call<GuardianClass> getHeroes(@Path ("topstories") String topstories, @Path("v2") String v2 , @Path("home") String home,
                                        @Query("api-key") String apiKey);

}
