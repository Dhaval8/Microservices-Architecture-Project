package com.example.Service;

import com.example.Entity.bookingEntity;
import com.example.Repository.bookingRepository;
import com.example.Service.bookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bookingServiceImpl implements bookingService {

    @Autowired
    private bookingRepository bookingRepository;

    @Override
    public bookingEntity createBooking(bookingEntity booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<bookingEntity> getBookingById(int id) {
        return bookingRepository.findById(id);

    }

    @Override
    public List<bookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public bookingEntity updateBooking(int id, bookingEntity booking) {
        return bookingRepository.findById(id)
                .map(existingBooking -> {
                    existingBooking.setVehicle_id(booking.getVehicle_id());
                    existingBooking.setStatus(booking.getStatus());
                    existingBooking.setUser_id(booking.getUser_id());
                    existingBooking.setStart_date(booking.getStart_date());
                    existingBooking.setEnd_date(booking.getEnd_date());
                    return bookingRepository.save(existingBooking);
                }).orElseThrow(() -> new RuntimeException("Booking not found with id " + id));
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.deleteById(id);
    }
}