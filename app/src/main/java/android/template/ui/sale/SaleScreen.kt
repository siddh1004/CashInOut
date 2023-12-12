package android.template.ui.sale

import android.template.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun SaleScreen(modifier: Modifier = Modifier, viewModel: SaleViewModel = hiltViewModel()) {
  //  val items by viewModel.uiState.collectAsStateWithLifecycle()
  //  if (items is SaleUiState.Success) {
  SaleScreen(
    items = listOf(),
    onSave = viewModel::addMyModel,
    modifier = modifier
  )
  //  }
}

@Composable
internal fun SaleScreen(
  items: List<String>,
  onSave: (name: String) -> Unit,
  modifier: Modifier = Modifier
) {
  Text(text = "Sale")
}

// Previews

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
  MyApplicationTheme {
    SaleScreen(listOf("Compose", "Room", "Kotlin"), onSave = {})
  }
}

@Preview(showBackground = true, widthDp = 480)
@Composable
private fun PortraitPreview() {
  MyApplicationTheme {
    SaleScreen(listOf("Compose", "Room", "Kotlin"), onSave = {})
  }
}