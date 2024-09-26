package ui.state

import androidx.compose.runtime.Stable
import data.model.ui.Photo

@Stable
internal data class HomeScreenState(
    val selectedImage: Photo? = null,
    val isImagePreviewDialogVisible: Boolean = false,
    val isDownloadImageDialogVisible: Boolean = false,
    val searchFieldValue: String = "",
)
