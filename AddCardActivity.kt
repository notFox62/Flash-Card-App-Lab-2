package com.example.flashcardappcurrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar

class AddCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)

        val questionEditText = findViewById<EditText>(R.id.question_p1)
        val answerEditText = findViewById<EditText>(R.id.anwser_p1)



        val saveButton = findViewById<ImageView>(R.id.save_question_button)
        saveButton.setOnClickListener{
            val questionString = questionEditText.text.toString()
            val anwserString = answerEditText.text.toString()

            val data = Intent()
            data.putExtra("QUESTION_KEY", questionString)
            data.putExtra("ANSWER_KEY", anwserString)

            setResult(RESULT_OK, data)
            finish()
        }
        val cancelButton = findViewById<ImageView>(R.id.close_question_button)
        cancelButton.setOnClickListener{
            finish()
        }

    }
}