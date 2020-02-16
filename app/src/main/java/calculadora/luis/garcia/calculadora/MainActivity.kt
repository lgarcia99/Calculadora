package calculadora.luis.garcia.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // campos de texto
        val ecuacion:TextView = findViewById(R.id.ecuacion)
        val resultado:TextView = findViewById(R.id.resultado)

        // botones numéricos
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
        seis.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "6")
        }

        val siete:Button = findViewById(R.id.siete) as Button;
        siete.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "7")
        }

        val ocho:Button = findViewById(R.id.ocho) as Button;
        ocho.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "8")
        }

        val nueve:Button = findViewById(R.id.nueve) as Button;
        nueve.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "9")
        }

        // botones de operación
        val mas:Button = findViewById(R.id.mas) as Button;
        mas.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "+")
        }

        val menos:Button = findViewById(R.id.menos) as Button;
        menos.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "-")
        }

        val por:Button = findViewById(R.id.por) as Button;
        por.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "*")
        }

        val entre:Button = findViewById(R.id.entre) as Button;
        entre.setOnClickListener {
            ecuacion.setText(ecuacion.text.toString() + "/")
        }

        val resultB:Button = findViewById(R.id.result) as Button;
        resultB.setOnClickListener {
            try {

            }catch (e: Exception){
                Log.d("Exception"," message : " + e.message )
            }
        }

        val borrarB:Button = findViewById(R.id.borrar) as Button;
        borrarB.setOnClickListener {
            ecuacion.setText("")
            resultado.setText("")
        }
    }

    fun validar(texto: String): Boolean{
        /*if () {

        }*/ return true
    }
}
