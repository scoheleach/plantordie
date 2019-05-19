package hu.ait.plantordieapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class SplashActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            Handler().postDelayed({
                    val intent = Intent(this, ScrollingActivity::class.java);
                    startActivity(intent);
                    finish();
            },3000)
    }
}
