package com.example.danplab2_compose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danplab2_compose.ui.theme.DANPLAB2COMPOSETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposable()
        }
    }
}

data class Plato(val nombre: String, val departamento:String)

data class Publicidad(val titulo:String)

private val listaPlatos= listOf(
    Plato(nombre="Ceviche de Pescado",departamento="Arequipa"),
    Plato(nombre="Lomo Saltado",departamento="Arequipa"),
    Plato(nombre="Papa Rellena",departamento="Arequipa"),
    Plato(nombre="Escabeche de Pescado",departamento="Arequipa"),
    Plato(nombre="Picarones",departamento="Arequipa"),
    Plato(nombre="Arroz con Mariscos",departamento="Arequipa"),
    Plato(nombre="Carapulcra",departamento="Arequipa"),
    Plato(nombre="Tallarín Saltado Criollo",departamento="Arequipa"),
    Plato(nombre="Pavo al Horno",departamento="Arequipa"),
    Plato(nombre="Ají de Gallina",departamento="Arequipa"),
    Plato(nombre="Arroz con Leche",departamento="Arequipa"),
    Plato(nombre="Tallarines Rojos",departamento="Arequipa"),
    Plato(nombre="Chilcano de Pescado",departamento="Arequipa"),
    Plato(nombre="Mazamorra Morada",departamento="Arequipa"),
    Plato(nombre="Arroz a la Jardinera",departamento="Arequipa"),
    Plato(nombre="Empanada de Carne",departamento="Arequipa"),
    Plato(nombre="Tamales de Pollo o Chancho",departamento="Arequipa"),
    Plato(nombre="Turrón de Doña Pepa",departamento="Arequipa")
)
private val listaPublicidad= listOf(
    Publicidad(titulo="Publicidad 1"),
    Publicidad(titulo="Publicidad 2"),
    Publicidad(titulo="Publicidad 3"),
    Publicidad(titulo="Publicidad 4")
)



@Composable
fun SimpleComposable() {
    LazyColumn(contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        item{
            Text(
                text="Platos Típicos",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Black
                )
            )


        }
        items(listaPlatos){
            PlatoDiseño(plato = it)
        }
    }
}

// @Preview(showBackground = true)
@Composable
fun PlatoDiseño(plato:Plato) {
    Row(
        modifier=Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {
        Text(
            text= plato.nombre,
            style= TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                fontStyle = FontStyle.Italic
            )
        )

    }
    //DANPLAB2COMPOSETheme {
      //  Greeting("Android")
    //}
}