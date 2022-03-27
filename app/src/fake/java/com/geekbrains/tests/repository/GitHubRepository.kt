package com.geekbrains.tests.repository

import com.geekbrains.tests.model.SearchResponse
import com.geekbrains.tests.presenter.RepositoryContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class GitHubRepository(private val gitHubApi: GitHubApi): RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        if (query=="algol"){
            callback.handleGitHubResponse(Response.success(SearchResponse(2283, listOf())))
        } else {
            callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
        }

    }
}
