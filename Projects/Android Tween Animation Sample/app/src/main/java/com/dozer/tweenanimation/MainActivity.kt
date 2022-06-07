package com.dozer.tweenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinButton.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.spin)
            imageView.startAnimation(an)

            blinkButton.setOnClickListener {
                var an = AnimationUtils.loadAnimation(this,R.anim.blink)
                imageView.startAnimation(an)
            }

            zoomButton.setOnClickListener {
                var an = AnimationUtils.loadAnimation(this,R.anim.zoom)
                imageView.startAnimation(an)
            }

            moveButton.setOnClickListener {
                var an = AnimationUtils.loadAnimation(this,R.anim.move)
                imageView.startAnimation(an)
            }
        }
    }
}