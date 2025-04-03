package com.example.DTO;


import java.sql.Date;

public class BookingDTO {
        int booking_id;
        int vehicle_id;
        String status;
        int user_id;
        Date start_date;
        Date end_date;

        public int getBooking_id() {
            return booking_id;
        }

        public void setBooking_id(int booking_id) {
            this.booking_id = booking_id;
        }

        public int getVehicle_id() {
            return vehicle_id;
        }

        public void setVehicle_id(int vehicle_id) {
            this.vehicle_id = vehicle_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public Date getStart_date() {
            return start_date;
        }

        public void setStart_date(Date start_date) {
            this.start_date = start_date;
        }

        public Date getEnd_date() {
            return end_date;
        }

        public void setEnd_date(Date end_date) {
            this.end_date = end_date;
        }
}
