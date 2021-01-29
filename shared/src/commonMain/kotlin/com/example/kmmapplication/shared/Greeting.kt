package com.example.kmmapplication.shared


class Greeting {
    fun greeting(): String {
        return "Guess what its is ==>, ${Platform().platform.reversed()}!"
    }
}
