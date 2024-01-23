package com.seregaklim.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import com.seregaklim.lottieanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            download.setOnClickListener {
                lottieView.setMinProgress(0.0f)
                lottieView.setMaxProgress(0.59f)
                lottieView.repeatCount = LottieDrawable.INFINITE
                lottieView.repeatMode = LottieDrawable.REVERSE
                lottieView.playAnimation()
            }
            stopDownload.setOnClickListener {
                lottieView.setMinProgress(0.59f)
                lottieView.setMaxProgress(0.75f)
                lottieView.repeatCount = 0
                lottieView.repeatMode = LottieDrawable.RESTART
                lottieView.playAnimation()
            }
            fullAnim.setOnClickListener {
                lottieView.setMinProgress(0.0f)
                lottieView.setMaxProgress(1.0f)
                lottieView.repeatCount = 0
                lottieView.repeatMode = LottieDrawable.RESTART
                lottieView.playAnimation()
            }
        }
    }
}