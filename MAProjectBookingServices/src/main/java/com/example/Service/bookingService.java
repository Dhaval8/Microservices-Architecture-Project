package com.example.Service;

import com.example.Entity.bookingEntity;
import java.util.List;
import java.util.Optional;

public interface bookingService {
    bookingEntity createBooking(bookingEntity booking);
    Optional<bookingEntity> getBookingById(int id);
    List<bookingEntity> getAllBookings();
    bookingEntity updateBooking(int id, bookingEntity booking);
    void deleteBooking(int id);
}