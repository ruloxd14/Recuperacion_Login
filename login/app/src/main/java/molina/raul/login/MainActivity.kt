package molina.raul.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_registrar: Button = findViewById(R.id.btn_registrar)
        var campo_nombre: TextView = findViewById(R.id.et_nombre)
        var campo_apellido: TextView = findViewById(R.id.et_apellido)

        btn_registrar.setOnClickListener {
            var nombre: String = campo_nombre.text.toString()
            var apellido: String = campo_apellido.text.toString()

            //Toast.makeText(this,"$nombre $apellido", Toast.LENGTH_LONG).show()

            val intent: Intent = Intent(this, BienvenidoActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("apellido", apellido)
            startActivity(intent)
        }

    }
}