package com.example.quotes.utilities

import com.example.quotes.data.FakeDao
import com.example.quotes.data.QuoteRepositoryImp
import com.example.quotes.ui.quotes.QuotesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRepository
    single { FakeDao() }
    single { QuoteRepositoryImp(get()) }
    viewModel { QuotesViewModel(get()) }
}