package com.mj.imagepalooza.api

import com.mj.imagepalooza.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)