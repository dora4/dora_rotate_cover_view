package dora.widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rotateCoverView = findViewById<DoraRotateCoverView>(R.id.rotateCoverView)
        // 设置转一圈的时间为10秒钟
        rotateCoverView.setRotateDuration(10000)
        rotateCoverView.start(R.drawable.cover, true)
    }
}