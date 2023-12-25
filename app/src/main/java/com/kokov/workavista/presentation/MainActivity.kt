package com.kokov.workavista.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kokov.workavista.R
import com.kokov.workavista.presentation.event.EventFragment
import com.kokov.workavista.presentation.post.PostFragment
import com.kokov.workavista.presentation.user.UserFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.navigation)


        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_navigation_posts -> {
                    loadFragment(PostFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_navigation_events -> {
                    loadFragment(EventFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_navigation_users -> {
                    loadFragment(UserFragment())
                    return@setOnItemSelectedListener true
                }

                else -> return@setOnItemSelectedListener false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }

}




