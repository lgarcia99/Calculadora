package calculadora.luis.garcia.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val ecuacion:TextView = findViewById(R.id.ecuacion)
    val resultado:TextView = findViewById(R.id.resultado)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cero:Button = findViewById(R.id.cero) as Button;
        cero.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "0")
        }

        val uno:Button = findViewById(R.id.uno) as Button;
        uno.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "1")
        }

        val dos:Button = findViewById(R.id.dos) as Button;
        dos.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "2")
        }

        val tres:Button = findViewById(R.id.tres) as Button;
        tres.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "3")
        }

        val cuatro:Button = findViewById(R.id.cuatro) as Button;
        cuatro.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "4")
        }

        val cinco:Button = findViewById(R.id.cinco) as Button;
        cinco.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "5")
        }

        val seis:Button = findViewById(R.id.seis) as Button;
        val siete:Button = findViewById(R.id.siete) as Button;
        val ocho:Button = findViewById(R.id.ocho) as Button;
        val nueve:Button = findViewById(R.id.nueve) as Button;
        val mas:Button = findViewById(R.id.mas) as Button;
        val menos:Button = findViewById(R.id.menos) as Button;
        val por:Button = findViewById(R.id.por) as Button;
        val entre:Button = findViewById(R.id.entre) as Button;
        val resultB:Button = findViewById(R.id.result) as Button;
        val borrarB:Button = findViewById(R.id.borrar) as Button;
    }
}
