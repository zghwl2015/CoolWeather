package android.example.hwl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by monlonwong on 2017/1/31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}