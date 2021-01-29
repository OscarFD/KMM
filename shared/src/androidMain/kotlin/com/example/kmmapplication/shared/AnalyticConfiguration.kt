package com.example.kmmapplication.shared

actual class AnalyticConfiguration actual constructor() {
    actual fun initialize(appID: String, analyticToken: String) {
        println("Android analytic client initialized with AppID ${appID} and token ${analyticToken}")
    }
}