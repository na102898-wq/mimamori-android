package jp.mimamori.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)
        layout.setBackgroundColor(Color.rgb(240, 248, 255))

        val title = TextView(this)
        title.text = "見守りアプリ"
        title.textSize = 30f
        title.setTextColor(Color.rgb(30, 80, 130))
        title.gravity = Gravity.CENTER

        val message = TextView(this)
        message.text = "\n大切な家族を見守りましょう\n\n見守りアプリを準備しています。"
        message.textSize = 18f
        message.gravity = Gravity.CENTER
        message.setTextColor(Color.DKGRAY)

        layout.addView(title)
        layout.addView(message)
        setContentView(layout)
    }
}
