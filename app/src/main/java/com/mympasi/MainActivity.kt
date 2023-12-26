package com.mympasi

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mympasi.databinding.ActivityMainBinding
import com.mympasi.ui.news.NewsFragment
import com.mympasi.ui.home.HomeFragment
import com.mympasi.ui.settings.SettingsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavigationView = findViewById(R.id.buttom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.navigation_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.navigation_news -> {
                    replaceFragment(NewsFragment())
                    true
                }
                R.id.navigation_settings -> {
                    replaceFragment(SettingsFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.nav_host_fragment_activity_main, fragment)
            commit()
        }
    }

}