package com.example.projeto

class ParkingLot {
    val totalSpots: Int

    var occupiedSpots: Int

    var availableSpots: Int

    val reservedSpots: MutableList<Reservation>


    constructor(totalSpots: Int) {
        this.totalSpots = totalSpots
        this.occupiedSpots = 0
        this.availableSpots = totalSpots
        this.reservedSpots = mutableListOf()
    }

    fun addCar() {
        if (availableSpots > 0) {
            occupiedSpots++
            availableSpots--
        }
    }

    fun removeCar() {
        if (occupiedSpots > 0) {
            occupiedSpots--
            availableSpots++
        }
    }

    // Method to reserve a spot in the premium area for a given time and day
    fun reserveSpot(spot: Int, startTime: String, endTime: String, day: String) {
        // Check if the spot is available
        if (!reservedSpots.contains(spot) && spot <= totalSpots) {
            // Create a reservation object with the given parameters
            val reservation = Reservation(startTime, endTime, day)

            // Add the reservation to the list of reserved spots
            reservedSpots[spot] = reservation

            availableSpots--
        }
    }

    // Method to release a reserved spot
    fun releaseSpot(spot: Int) {
        // Check if the spot is reserved
        if (reservedSpots.contains(spot)) {
            reservedSpots.removeAt(spot)
            availableSpots++
        }
    }
}