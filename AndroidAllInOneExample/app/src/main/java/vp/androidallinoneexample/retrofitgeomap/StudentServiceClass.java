package vp.androidallinoneexample.retrofitgeomap;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import vp.androidallinoneexample.retrofitgeomap.model.StudentServiceInterface;


/**
 * Created by Vyas on 6/5/2016.
 */
public class StudentServiceClass {
    static StudentServiceInterface mStudentServiceInterface;
    public static final String url=HttpConstant.BASE_URL;
    public static StudentServiceInterface siteConnection(){
        if(mStudentServiceInterface==null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            });
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(url)
                    .build();
            mStudentServiceInterface =retrofit.create(StudentServiceInterface.class);
        }

        return mStudentServiceInterface;
    }
}
