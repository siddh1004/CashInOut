package android.template.ui.home

import android.template.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(modifier: Modifier = Modifier, viewModel: HomeViewModel = hiltViewModel()) {
  HomeScreen(
    modifier = modifier
  )
}

@Composable
internal fun HomeScreen(
  modifier: Modifier = Modifier,
  navController: NavController
) {
  Column(modifier) {
    Button(
      onClick = { navController.navigate("sale") },
    ) {
      Text(text = "Sale")
    }
    Button(
      onClick = { /*TODO*/ },
    ) {
      Text(text = "Purchase")
    }
    Button(
      onClick = { /*TODO*/ },
    ) {
      Text(text = "Payment")
    }
    Button(
      onClick = { /*TODO*/ },
    ) {
      Text(text = "Merchant")
    }
  }
}

// Previews

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
  MyApplicationTheme {
    HomeScreen()
  }
}

@Preview(showBackground = true, widthDp = 480)
@Composable
private fun PortraitPreview() {
  MyApplicationTheme {
    HomeScreen()
  }
}