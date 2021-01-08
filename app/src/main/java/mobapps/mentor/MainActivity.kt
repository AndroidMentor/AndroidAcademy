package mobapps.mentor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_view)
        textView.setOnClickListener {
            val intent = Intent(this, MovieDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}