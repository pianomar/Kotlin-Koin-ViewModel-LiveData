package com.example.quotes.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.quotes.R
import com.example.quotes.data.Quote
import kotlinx.android.synthetic.main.activity_quotes.*
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuotesActivity : AppCompatActivity() {

    private val viewModel: QuotesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        viewModel.getQuotes().observe(this, Observer { quotes ->
            var text = ""
            for (quote in quotes) {
                text = text + " " + quote
            }
            textView_quotes.text = text
        })

        button_add_quote.setOnClickListener {
            val quote = Quote(editText_quote.text.toString(), editText_author.text.toString())
            viewModel.addQuote(quote)
            editText_quote.setText("")
            editText_author.setText("")
        }
    }
}
