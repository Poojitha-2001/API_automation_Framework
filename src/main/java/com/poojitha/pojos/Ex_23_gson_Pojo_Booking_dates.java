package com.poojitha.test.gson;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Generated("jsonschema2pojo")
public class Ex_23_gson_Pojo_Booking_dates {
    @SerializedName("checkin")
    @Expose
    private String checkin;
    @SerializedName("checkout")
    @Expose
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

}


