package com.example.kmmapplication.shared

class AnalyticManager {

    fun initialize(appID: String, appToken: String) {
        AnalyticConfiguration().initialize(appID, appToken)
    }

    fun logEvent(eventName: String, eventParam: Map<String, String> ) {
        println("Received and event ${eventName} with parameters from ${Platform().platform}")
    }
}