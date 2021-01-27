package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstance
import com.example.newsapp.db.ArticleDataBase
import com.example.newsapp.models.Article
import retrofit2.Retrofit

class NewsRepository(
    val db : ArticleDataBase
) {

     //Network requests
    suspend fun getBreakingNews(countryCode: String, pageNumber:Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery : String, pageNumber : Int) =
        RetrofitInstance.api.searchNews(searchQuery,pageNumber)


    // Local db functions
    suspend fun insertArticle(article:Article) = db.getDao().insert(article)

    fun getSavedArticles() = db.getDao().getSavedArticles()

    suspend  fun deleteArticle (article: Article) = db.getDao().deleteArticle(article)




}