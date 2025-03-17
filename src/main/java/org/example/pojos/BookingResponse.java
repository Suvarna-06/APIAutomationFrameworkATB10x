package org.example.pojos;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookingResponse {

    // We have created this class to extract all the keys.

        @SerializedName("bookingid")
        @Expose
        private Integer bookingid;
        @SerializedName("booking")
        @Expose
        private Booking booking;

        public Integer getBookingid() {
            return bookingid;
        }

        public void setBookingid(Integer bookingid) {
            this.bookingid = bookingid;
        }

        public Booking getBooking() {
            return booking;
        }

        public void setBooking(Booking booking) {
            this.booking = booking;
        }

    }

