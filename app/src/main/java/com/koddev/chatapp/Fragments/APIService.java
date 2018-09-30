package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAArRZpdjk:APA91bECId9KDeQc-HmuCXmUsJ3QXj3HTzr85PmOrY6gMHmCFejBZ-WwcSK_12TWUqzKFCT0S1PV7i-mYIwlb1Al3ES0R4FPOf1xEhlp57bhCoR1n6k5j34JxFMpePIEB5lAIz4vMLZl"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
