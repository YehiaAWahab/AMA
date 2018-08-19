package io.github.yahiaabdelwahab.ama

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    private val ActivityIndex = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        settings_bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                }
                R.id.action_search -> {
                    startActivity(Intent(this, SearchActivity::class.java))
                    overridePendingTransition(0, 0)
                }
                R.id.action_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    overridePendingTransition(0, 0)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    override fun onResume() {
        super.onResume()
        settings_bottom_nav.menu.getItem(ActivityIndex).setChecked(true);
    }
}