package ch.rrte.pl.tasky

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.rrte.pl.tasky.greeting.GreetingView
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import pg_pl_tasky_app.composeapp.generated.resources.Res
import pg_pl_tasky_app.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    GreetingView()
}