package yuricfurusho.jetpackcomposetutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                NewStory()
            }
        }
    }

    @Composable
    private fun NewStory() {
        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }

    @Preview
    @Composable
    private fun DefaultPreview() {
        NewStory()
    }
}
