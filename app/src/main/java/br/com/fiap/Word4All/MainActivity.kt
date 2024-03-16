package br.com.fiap.Word4All

import androidx.activity.ComponentActivity
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    var username by remember {mutableStateOf ("")}
    var password by remember {mutableStateOf ("")}
    var rememberMeCheck by remember {mutableStateOf (false)}

