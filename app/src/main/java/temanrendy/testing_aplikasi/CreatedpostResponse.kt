package temanrendy.testing_aplikasi

import com.google.gson.annotations.SerializedName

data class CreatedpostResponse(
    val userId: String?,
    val id: Int,
    val title: String?,
    @SerializedName("body")
    val text: String?
)