package com.example.kmmapplication.shared

expect class AnalyticConfiguration() {
    fun initialize(appID: String, analyticToken: String)
}