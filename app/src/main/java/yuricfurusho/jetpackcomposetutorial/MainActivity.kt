package yuricfurusho.jetpackcomposetutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }

    @Composable
    private fun NewStory() {
        TODO("Not yet implemented")
    }

    @Preview
    @Composable
    private fun PreviewNewStory() {
        TODO("Not yet implemented")
    }
}
