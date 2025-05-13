package com.sujoy.plantcare.DataModel

data class NewsData(
    val articles: List<Article?>?,
    val status: String?,
    val totalResults: Int?
)