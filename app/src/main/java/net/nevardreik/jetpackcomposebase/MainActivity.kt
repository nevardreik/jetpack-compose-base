package net.nevardreik.jetpackcomposebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import net.nevardreik.jetpackcomposebase.ui.theme.JetpackComposeBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBaseTheme {

            }
        }
    }
}
