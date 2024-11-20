package org.tkcy.bbounutriapp;

import com.google.gson.Gson
import java.io.Writer

data class SimpleAliment(val id: Int, val name: String, val glucides: Int, val proteines: Int, val lipides: Int, val kcal: Int) {

    fun serialize(): String {
        val gson = Gson()
        return gson.toJson(this)
    }


}
