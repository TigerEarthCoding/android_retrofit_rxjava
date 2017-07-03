package tigerearth.tigercoding.android_retrofit_rxjava.network;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import tigerearth.tigercoding.android_retrofit_rxjava.model.Andriod;

public interface RequestInterface {
    @GET("android/jsonarray/")
    Observable<List<Andriod>> register();
}
