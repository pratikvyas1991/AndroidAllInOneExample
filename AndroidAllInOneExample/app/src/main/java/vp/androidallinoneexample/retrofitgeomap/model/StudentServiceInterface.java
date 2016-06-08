package vp.androidallinoneexample.retrofitgeomap.model;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import vp.androidallinoneexample.retrofitgeomap.HttpConstant;


/**
 * Created by Vyas on 6/5/2016.
 */
public interface StudentServiceInterface {
    @GET(HttpConstant.DETAILS_URL)
    Call<GeoNameList> getCities(@Query("north") String north, @Query("south") String south,
                              @Query("east") String east, @Query("west") String west,
                              @Query("lang") String lang, @Query("username") String username);
}
