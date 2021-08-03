package abdelhakim.hacine.med.news_mvvm_coroutines.models



data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)