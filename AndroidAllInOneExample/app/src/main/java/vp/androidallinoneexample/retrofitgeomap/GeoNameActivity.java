package vp.androidallinoneexample.retrofitgeomap;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import vp.androidallinoneexample.R;
import vp.androidallinoneexample.retrofitgeomap.model.GeoNameList;
import vp.androidallinoneexample.retrofitgeomap.model.Geoname;
import vp.androidallinoneexample.retrofitgeomap.model.StudentServiceInterface;


/**
 * Created by Vyas on 6/5/2016.
 */
public class GeoNameActivity extends Activity {
    TextView mCityName,mCityPopulation;
    GeoNameList geoNameList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrofit_geoname);
        mCityName=(TextView)findViewById(R.id.city_name_value);
        mCityPopulation=(TextView)findViewById(R.id.population_value);
        getCityList(String.valueOf(44.1),String.valueOf(-9.9),String.valueOf(-22.4),String.valueOf(55.2),"de","demo");

        class PrintCity{
            public void printhhere(String city,String population){
                mCityName.setText(city);
                mCityPopulation.setText(population);
            }
        }
    }
    public void getCityList( String north, String south,String east,String west,String lang,String username){
        StudentServiceInterface serviceInterface = StudentServiceClass.siteConnection();
        Call<GeoNameList> call = serviceInterface.getCities(north,south,east,west,lang,username);
        call.enqueue(new Callback<GeoNameList>() {
            @Override
            public void onResponse(Response<GeoNameList> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    geoNameList=response.body();
//                    for (Geoname geoname:geoNameList.getGeonames()){
//                        if(geoname.getName().equals("Mexiko-Stadt")){
//                            mCityName.setText(geoname.getToponymName());
//                        }
//                    }
                    displayCities(geoNameList);

                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("Error ",t.getMessage());
            }
        });
    }

    public void displayCities(GeoNameList geoNameList){
        Log.d("OutPut ","@@@@@@@");
        for (Geoname geoname:geoNameList.getGeonames()){
            if(geoname.getName().equals("Mexiko-Stadt")){

            }
            Log.d("Name : ",geoname.getName());
            Log.d("Population : ",String.valueOf(geoname.getPopulation()));
        }
    }

}
