package br.com.fiap.Word4All.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.fiap.Word4All.R
import br.com.fiap.Word4All.ui.theme.PurpleGrey200

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldCustom(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    icon: Int = R.drawable.ic_username,
    iconContentDescription: String? = null
){

    TextField(
        value,
        onValueChange,
        modifier,
        label = {
            Text(text = hint, color = Color.White)
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.Yellow,
            cursorColor = Color.White
        ),
        maxLines = 1,
        textStyle = TextStyle(
            color = Color.Magenta,
            fontSize = 18.sp
        ),
        keyboardOptions = keyboardOptions,
        leadingIcon = {
            androidx.compose.material3.Icon(
                painter = painterResource(id = icon),
                contentDescription = iconContentDescription,
                tint = Color.Red
            )

        }

    )


}

@Composable
@Preview
private fun TextFieldCustomPreview() {


    var usarname by remember {
        mutableStateOf("")
    }

    TextFieldCustom(
        value = usarname,
        onValueChange = {
            usarname = it
        },
        hint = "Username",
        icon = R .drawable . ic_username,
        iconContentDescription = "Icon Username"
    )
}

























