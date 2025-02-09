package com.tarea1.tarea3.despliegue.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tarea1.tarea3.model.Estado

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Principal(estado: Estado, actualizarEstado: (Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Manejo de Estado") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Contador: ${estado.contador}", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Button(onClick = { actualizarEstado(estado.contador + 1) }) {
                    Text("+1")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { actualizarEstado(estado.contador + 2) }) {
                    Text("+2")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Button(onClick = { actualizarEstado(estado.contador * 2) }) {
                    Text("×2")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { actualizarEstado(estado.contador - 1) }) {
                    Text("-1")
                }
            }
        }
    }
}