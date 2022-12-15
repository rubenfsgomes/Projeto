package com.example.projeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parkingLot1 = ParkingLot(10)

        parkingLot1.addCar()

        parkingLot1.reserveSpot(5, "14:00", "17:00", "16/06/2022")
    }

}