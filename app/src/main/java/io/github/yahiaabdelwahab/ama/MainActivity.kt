package io.github.yahiaabdelwahab.ama

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val ActivityIndex = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home_bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_search -> {
                    startActivity(Intent(this, SearchActivity::class.java))
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }


    override fun onResume() {
        super.onResume()
        home_bottom_nav.menu.getItem(ActivityIndex).setChecked(true);
    }
}
