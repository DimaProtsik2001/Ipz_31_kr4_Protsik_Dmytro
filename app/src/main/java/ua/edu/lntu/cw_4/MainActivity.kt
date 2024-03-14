package ua.edu.lntu.cw_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw_4.ui.theme.Ipz_31_kr4_Protsik_DmytroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ipz_31_kr4_Protsik_DmytroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

enum class TaskStatus {
    ACTIVE,
    DONE
}
data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val status: TaskStatus
)
@Composable
fun MyApp() {
    val tasks = remember { mutableStateListOf(
        Task(1, "Задача номер 1", "Опис задачі номер 1", "2024-03-21", TaskStatus.ACTIVE),
        Task(2, "Задача номер 2", "Опис задачі номер 2", "2024-04-06", TaskStatus.DONE),
        Task(3, "Задача номер 3", "Опис задачі номер 3", "2024-05-18", TaskStatus.ACTIVE),
        Task(4, "Задача номер 4", "Опис задачі номер 4", "2024-06-01", TaskStatus.DONE),
        Task(5, "Задача номер 5", "Опис задачі номер 5", "2024-07-30", TaskStatus.ACTIVE)
    ) }

    var currentScreen by remember { mutableStateOf("TaskList") }
    var selectedTask by remember { mutableStateOf<Task?>(null) }


}