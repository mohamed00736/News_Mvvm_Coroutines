package abdelhakim.hacine.med.news_mvvm_coroutines.repository

import abdelhakim.hacine.med.news_mvvm_coroutines.api.RetrofitInstance
import abdelhakim.hacine.med.news_mvvm_coroutines.db.ArticleDatabase
import abdelhakim.hacine.med.news_mvvm_coroutines.models.Article


class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}