package com.example.android.marsphotos.netkork

import com.squareup.moshi.Json

data class MarsPhoto(
    val id: String,
    @Json(name = "img_src") val imgSrcUrl: String
)