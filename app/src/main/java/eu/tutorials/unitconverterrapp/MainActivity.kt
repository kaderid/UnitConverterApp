package eu.tutorials.unitconverterrapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import eu.tutorials.unitconverterrapp.compose.BaseScreen
import eu.tutorials.unitconverterrapp.data.ConverterDatabase
import eu.tutorials.unitconverterrapp.data.ConverterRepository
import eu.tutorials.unitconverterrapp.data.ConverterRepositoryImpl
import eu.tutorials.unitconverterrapp.ui.theme.UnitConverterrAppTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var factory : ConverterViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UnitConverterrAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BaseScreen(factory = factory)
                }
            }
        }
    }
}

