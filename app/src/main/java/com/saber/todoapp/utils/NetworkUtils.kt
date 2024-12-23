package com.saber.todoapp.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

// Utility object for network-related functions
object NetworkUtils {

    // Function to check if the network is available
    fun isNetworkAvailable(context: Context): Boolean {
        // Get the ConnectivityManager system service
        val connectivityManager = context.getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager

        // Get the active network or return false if there is no active network
        val activeNetwork = connectivityManager.activeNetwork ?: return false

        // Get the network capabilities of the active network or return false if not available
        val networkCapabilities =
            connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false

        // Return true if the network has internet capability, false otherwise
        return networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
    }
}