package com.tarea1.tarea3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.tarea1.tarea3.model.Estado
import com.tarea1.tarea3.despliegue.componentes.Principal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var estado by remember { mutableStateOf(Estado(contador = 0)) }

            Principal(estado) { nuevoValor ->
                estado = Estado(nuevoValor)
            }
        }
    }
}
