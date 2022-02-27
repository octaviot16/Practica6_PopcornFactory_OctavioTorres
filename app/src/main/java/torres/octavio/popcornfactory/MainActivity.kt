package torres.octavio.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botonP: Button = findViewById(R.id.botonP)

        botonP.setOnClickListener() {
            var intent: Intent =Intent(this, Catalogo::class.java)
            startActivity(intent)
        }

    }
}