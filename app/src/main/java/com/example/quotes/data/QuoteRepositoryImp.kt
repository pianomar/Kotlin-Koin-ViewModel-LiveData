package com.example.quotes.data

class QuoteRepositoryImp(private val quoteDao: FakeDao) {
    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote )
    }

    fun getQuotes() = quoteDao.getQuotes()
}