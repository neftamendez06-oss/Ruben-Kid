package com.example.rubenkidinicio.data.datasources

import android.content.Context
import android.content.SharedPreferences
import com.example.rubenkidinicio.domain.models.User
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    private val context: Context
) : UserLocalDataSource {

    private val sharedPreferences: SharedPreferences = 
        context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    override suspend fun getUser(): User? {
        val id = sharedPreferences.getString("user_id", null)
        val name = sharedPreferences.getString("user_name", null)
        val email = sharedPreferences.getString("user_email", null)
        val profileImage = sharedPreferences.getString("user_profile_image", null)

        return if (id != null && name != null && email != null) {
            User(id = id, name = name, email = email, profileImage = profileImage)
        } else {
            null
        }
    }

    override suspend fun saveUser(user: User) {
        sharedPreferences.edit().apply {
            putString("user_id", user.id)
            putString("user_name", user.name)
            putString("user_email", user.email)
            putString("user_profile_image", user.profileImage)
            apply()
        }
    }

    override suspend fun deleteUser() {
        sharedPreferences.edit().clear().apply()
    }
}
