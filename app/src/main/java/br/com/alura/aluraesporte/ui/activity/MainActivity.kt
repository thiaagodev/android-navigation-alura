package br.com.alura.aluraesporte.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import br.com.alura.aluraesporte.R

class MainActivity : AppCompatActivity() {

    private val controlador by lazy {
        findNavController(R.id.main_activity_nav_host)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        controlador.addOnDestinationChangedListener { navController, navDestination, bundle ->
            title = navDestination.label

            when(navDestination.id) {
                R.id.listaProdutosFragment -> supportActionBar?.show()
                R.id.login -> supportActionBar?.hide()
            }
        }
    }

}
