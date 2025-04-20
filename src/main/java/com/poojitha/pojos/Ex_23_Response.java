package com.poojitha.test.gson;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Generated("jsonschema2pojo")
public class Ex_23_Response {
    @SerializedName("bookingid")
    @Expose
    private Integer bookingid;
    @SerializedName("booking")
    @Expose
    private Ex_23_gson_pojo_booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Ex_23_gson_pojo_booking getBooking() {
        return booking;
    }

    public void setBooking(Ex_23_gson_pojo_booking booking) {
        this.booking = booking;
    }

}


