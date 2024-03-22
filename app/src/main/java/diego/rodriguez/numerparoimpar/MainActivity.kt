package diego.rodriguez.numerparoimpar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNum = findViewById<EditText>(R.id.txtNum)
        val btnanalizar = findViewById<Button>(R.id.btnanalizar)
        val txtresultado = findViewById<TextView>(R.id.txtresultado)

        val msgCalcular = Calcular()

        btnanalizar.setOnClickListener {
           val resultado= msgCalcular.comprobar(txtNum.text.toString().toInt())
            txtresultado.text= "Su número : $resultado"
        }

    }
}