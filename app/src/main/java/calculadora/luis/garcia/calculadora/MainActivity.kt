package calculadora.luis.garcia.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // campos de texto
        val ecuacion: TextView = findViewById(R.id.ecuacion)
        val resultado: TextView = findViewById(R.id.resultado)

        // botones numéricos
        val cero: Button = findViewById(R.id.cero) as Button
        val uno: Button = findViewById(R.id.uno) as Button
        val dos: Button = findViewById(R.id.dos) as Button
        val tres: Button = findViewById(R.id.tres) as Button
        val cuatro: Button = findViewById(R.id.cuatro) as Button
        val cinco: Button = findViewById(R.id.cinco) as Button
        val seis: Button = findViewById(R.id.seis) as Button
        val siete: Button = findViewById(R.id.siete) as Button
        val ocho: Button = findViewById(R.id.ocho) as Button
        val nueve: Button = findViewById(R.id.nueve) as Button

        // botones de operación
        val mas: Button = findViewById(R.id.mas) as Button
        val menos: Button = findViewById(R.id.menos) as Button
        val por: Button = findViewById(R.id.por) as Button
        val entre: Button = findViewById(R.id.entre) as Button
        val resultB: Button = findViewById(R.id.result) as Button
        val borrarB: Button = findViewById(R.id.borrar) as Button

        // interacciones de la interfaz
        cero.setOnClickListener {
            ingresarDigito(ecuacion, "0")
        }
        uno.setOnClickListener {
            ingresarDigito(ecuacion,"1")
        }
        dos.setOnClickListener {
            ingresarDigito(ecuacion,"2")
        }
        tres.setOnClickListener {
            ingresarDigito(ecuacion, "3")
        }
        cuatro.setOnClickListener {
            ingresarDigito(ecuacion, "4")
        }
        cinco.setOnClickListener {
            ingresarDigito(ecuacion, "5")
        }
        seis.setOnClickListener {
            ingresarDigito(ecuacion, "6")
        }
        siete.setOnClickListener {
            ingresarDigito(ecuacion, "7")
        }
        ocho.setOnClickListener {
            ingresarDigito(ecuacion, "8")
        }
        nueve.setOnClickListener {
            ingresarDigito(ecuacion, "9")
        }
        mas.setOnClickListener {
            if (validarSignos(ecuacion)) ingresarDigito(ecuacion, "+")
        }
        menos.setOnClickListener {
            if (validarSignos(ecuacion)) ingresarDigito(ecuacion, "-")
        }
        por.setOnClickListener {
            if (validarSignos(ecuacion)) ingresarDigito(ecuacion, "*")
        }
        entre.setOnClickListener {
            if (validarSignos(ecuacion)) ingresarDigito(ecuacion, "/")
        }
        resultB.setOnClickListener {
            try {
                val res = validarEntrada(ecuacion)
                when {
                    res.isEmpty() -> throw Exception()
                    else -> resultado.setText(res)
                }
            } catch (e: Exception) {
            }
        }
        borrarB.setOnClickListener {
            val entrada = ecuacion.text.toString()
            if (!resultado.text.toString().isEmpty()) {
                ecuacion.setText("")
                resultado.setText("")
            } else {
                ecuacion.setText(entrada.substring(0, entrada.lastIndex))
            }
        }
    }

    fun validarSignos(ecuacion: TextView): Boolean{
        val entrada = ecuacion.text.toString()
        if (entrada.contains("+") || entrada.contains("-") || entrada.contains("*") || entrada.contains("/")) {
            if (entrada == "0") ecuacion.setText("0")
            return false
        }
        return true
    }

    fun validarEntrada(ecuacion: TextView): String {
        val entrada = ecuacion.text.toString()
        var split: List<CharSequence>
        var result = ""

        if(entrada.isEmpty()) {
            Toast.makeText(this@MainActivity, "Primero debe ingresar algún valor numérico.", Toast.LENGTH_SHORT).show()
            return result
        }

        if(esSuma(entrada)){
            split = entrada.split("+")
            result = (split[0].toInt() + split[1].toInt()).toString()
        }
        else if(esResta(entrada)){
            split = entrada.split("-")
            result = (split[0].toInt() - split[1].toInt()).toString()
        }
        else if(esMultiplicacion(entrada)){
            split = entrada.split("*")
            result = (split[0].toInt() * split[1].toInt()).toString()
        }
        else if(esDivision(entrada)) {
            split = entrada.split("/")
            if (split[1].toInt() == 0) {
                Toast.makeText(this@MainActivity, "No se puede dividir por cero.", Toast.LENGTH_SHORT).show()
                return ""
            } else {
                var result = split[0].toInt() / split[1].toInt()
            }
        }
        return result
    }

    fun ingresarDigito(ecuacion: TextView, digito: String) {
        ecuacion.setText(ecuacion.text.toString() + digito)
    }

    fun esSuma(entrada: String): Boolean = entrada.contains("+")
    fun esResta(entrada: String): Boolean = entrada.contains("-")
    fun esMultiplicacion(entrada: String): Boolean = entrada.contains("*")
    fun esDivision(entrada: String): Boolean = entrada.contains("/")
}
