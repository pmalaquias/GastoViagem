package com.pmalaquias.gastoviajem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pmalaquias.gastoviajem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    /**
     * Função responsável por fazer a criação da Activity
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }


    /**
     * Função responsável por tratar qualquer evento de  click nos elementos
    * */
    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate) {
            calculate()
        }
    }

    /**
     * Função responsável por validar os dados informado pelo usuario
    * */
    private fun isValid(): Boolean {
        return binding.editDistance.text.toString() != "" &&
               binding.editPrice.text.toString() != "" &&
               binding.editAutonomy.text.toString() != "" &&
               binding.editAutonomy.text.toString().toFloat() != 0f
    }

    /**
     * Função responsavel par calcular o curto da viagem
    * */
    private fun calculate() {

        if(isValid()) {
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()

            val totalValue = (distance * price) / autonomy
            val totalValueStr = "R$ ${"%.2f".format(totalValue)} "
            binding.textTotalValue.text = totalValueStr
        }else{
            // toast notification
            Toast.makeText(this,R.string.validation_fill_all_fields,Toast.LENGTH_LONG).show()
        }

    }

}