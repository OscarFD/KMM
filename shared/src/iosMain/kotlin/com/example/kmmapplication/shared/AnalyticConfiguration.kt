package com.example.kmmapplication.shared

actual class AnalyticConfiguration actual constructor() {
    actual fun initialize(appID: String, analyticToken: String) {
        print("iOS analytic client initialized with AppID ${appID} and token ${analyticToken}")
    }
}