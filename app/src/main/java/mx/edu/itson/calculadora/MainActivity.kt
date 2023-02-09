package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var numeros: String = ""
    var n1: Int = 0
    var n2: Int = 0
    var operacion: String = ""



    var operaciones: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultado: TextView = findViewById(R.id.resultado)
        var cadena: TextView = findViewById(R.id.visorNumeros)
        var cadenaOperaciones: TextView = findViewById(R.id.txtVisorOperacion)
        var uno: Button = findViewById(R.id.uno)
        var dos: Button = findViewById(R.id.dos)
        var tres: Button = findViewById(R.id.tres)
        var cuatro: Button = findViewById(R.id.cuatro)
        var cinco: Button = findViewById(R.id.cinco)
        var cero: Button = findViewById(R.id.cero)
        var seis: Button = findViewById(R.id.seis)
        var siete: Button = findViewById(R.id.siete)
        var ocho: Button = findViewById(R.id.ocho)
        var nueve: Button = findViewById(R.id.nueve)
        var mas: Button = findViewById(R.id.mas)
        var menos: Button = findViewById(R.id.menos)
        var multiplicacion: Button = findViewById(R.id.multiplicacion)
        var division: Button = findViewById(R.id.division)
        var borrar:Button=findViewById(R.id.borrar)


        borrar.setOnClickListener{
            cadena.setText("")
            cadenaOperaciones.setText("")
            numeros=""
            operacion=""
        }
        cero.setOnClickListener{
            cadena.setText(agregar('0'))
        }
        uno.setOnClickListener {
            cadena.setText(agregar('1'))

        }

        dos.setOnClickListener {

            cadena.setText(agregar('2'))
        }
        tres.setOnClickListener {
            cadena.setText(agregar('3'))

        }
        cuatro.setOnClickListener {
            cadena.setText(agregar('4'))

        }
        cinco.setOnClickListener {
            cadena.setText(agregar('5'))

        }
        seis.setOnClickListener {
            cadena.setText(agregar('6'))

        }
        siete.setOnClickListener {
            cadena.setText(agregar('7'))
        }
        ocho.setOnClickListener {
            cadena.setText(agregar('8'))

        }
        nueve.setOnClickListener {
            cadena.setText(agregar('9'))

        }

        mas.setOnClickListener {
            cadenaOperaciones.setText(agregar('+'))
            cadena.setText("0")


        }

        menos.setOnClickListener {
            cadenaOperaciones.setText(agregar('-'))
            cadena.setText("0")

        }

        multiplicacion.setOnClickListener {
            cadenaOperaciones.setText(agregar('*'))
            cadena.setText("0")

        }
        division.setOnClickListener {

            cadenaOperaciones.setText(agregar('/'))
            cadena.setText("0")
        }

        resultado.setOnClickListener {
            cadenaOperaciones.setText(calcular().toString())
            cadena.setText("0")

        }

    }

    fun agregar(caracter: Char):String {
        if (caracter == '+' || caracter == '-' || caracter == '/' || caracter == '*') {
            operaciones = numeros + caracter
            operacion = caracter.toString()


            n2 = numeros.toInt()
            numeros=""
            return operaciones


        } else {
            numeros = numeros + caracter
            n1 = numeros.toInt()
            return numeros

        }


    }

    fun calcular():Double {
        var result =0
        when (operacion) {
            "+" -> result= (n1+n2)
            "-" -> result =(n2-n1)
            "*" -> result= (n1*n2)
            "/" -> result= (n2/n1)
            else -> {

            }

        }
        numeros=""
        operaciones=""

        return result.toDouble()
    }
}