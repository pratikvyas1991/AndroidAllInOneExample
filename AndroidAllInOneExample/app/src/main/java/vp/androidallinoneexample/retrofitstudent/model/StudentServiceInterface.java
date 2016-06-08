package vp.androidallinoneexample.retrofitstudent.model;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import vp.androidallinoneexample.retrofitstudent.HttpConstant;


/**
 * Created by Vyas on 6/5/2016.
 */
public interface StudentServiceInterface {
    @GET(HttpConstant.SELECT_URL)
    Call<Books> getNames(@Query("nanme") String name);
}
