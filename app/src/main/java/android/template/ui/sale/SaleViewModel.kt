package android.template.ui.sale

import android.template.data.MyModelRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SaleViewModel @Inject constructor(
  private val myModelRepository: MyModelRepository
) : ViewModel() {

  val uiState: StateFlow<SaleUiState> = myModelRepository
    .myModels.map<List<String>, SaleUiState>(SaleUiState::Success)
    .catch { emit(SaleUiState.Error(it)) }
    .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), SaleUiState.Loading)

  fun addMyModel(name: String) {
    viewModelScope.launch {
      myModelRepository.add(name)
    }
  }
}

sealed interface SaleUiState {
  object Loading : SaleUiState
  data class Error(val throwable: Throwable) : SaleUiState
  data class Success(val data: List<String>) : SaleUiState
}