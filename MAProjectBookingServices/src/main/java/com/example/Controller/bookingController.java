package com.example.Controller;
import com.example.Entity.bookingEntity;
import com.example.Service.bookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookings")
public class bookingController {
    @Autowired
    private bookingService bookingService;

    @PostMapping
    public ResponseEntity<bookingEntity> createBooking(@RequestBody bookingEntity booking) {
        bookingEntity createdBooking = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBooking);
    }

    @GetMapping("/{id}")
    public ResponseEntity<bookingEntity> getBookingById(@PathVariable int id) {
        return bookingService.getBookingById(id)
                .map(ResponseEntity::ok)  // Returns 200 OK if booking is found
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(null));  // Returns 404 Not Found if booking is missing
    }

    @GetMapping
    public ResponseEntity<List<bookingEntity>> getAllBookings() {
        List<bookingEntity> bookings = bookingService.getAllBookings();

        if (bookings.isEmpty()) {
            return ResponseEntity.noContent().build();  // Returns 204 No Content if no bookings exist
        }

        return ResponseEntity.ok(bookings);  // Returns 200 OK with the list of bookings
    }

    @PutMapping("/{id}")
    public ResponseEntity<bookingEntity> updateBooking(@PathVariable int id, @RequestBody bookingEntity booking) {
        bookingEntity updatedBooking = bookingService.updateBooking(id, booking);
        return ResponseEntity.ok(updatedBooking);  // Returns 200 OK with updated booking
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.ok("Booking with ID " + id + " deleted successfully.");  // Returns confirmation message
    }
}
