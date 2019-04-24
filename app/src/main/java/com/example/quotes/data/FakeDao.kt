package com.example.quotes.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeDao {
    private val quoteList = mutableListOf<Quote>()
    private val liveData = MutableLiveData<List<Quote>>()
    init {
        liveData.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        liveData.value = quoteList //check
    }

    fun getQuotes() = liveData as LiveData<List<Quote>>
}