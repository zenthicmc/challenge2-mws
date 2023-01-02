package com.example.chalenggepemilihan

import android.content.Context
import android.content.SharedPreferences

class SessionManager(var context: Context?) {
    var pref: SharedPreferences? = context?.getSharedPreferences("GET_TOKEN", Context.MODE_PRIVATE)
    var editor: SharedPreferences.Editor? = pref?.edit()

    fun setPin(pin: String?) {
        editor?.putString("pin", pin)
        editor?.commit()
    }

    fun getPin(): String? {
        return pref?.getString("pin", "")
    }

    fun removeData() {
        editor?.clear()
        editor?.commit()
    }
}