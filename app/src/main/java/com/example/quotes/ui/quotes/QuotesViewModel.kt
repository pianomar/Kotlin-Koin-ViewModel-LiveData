package com.example.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotes.data.Quote
import com.example.quotes.data.QuoteRepositoryImp

class QuotesViewModel(val repository: QuoteRepositoryImp) : ViewModel() {
    fun getQuotes() = repository.getQuotes()
    fun addQuote(quote: Quote) = repository.addQuote(quote)
}