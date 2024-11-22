package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity2 : AppCompatActivity() {

    private var currentQuestionIndex = 0
    private val totalQuestionsToShow = 10
    private lateinit var progressBar: ProgressBar
    private lateinit var randomQuestions: List<Question>

    data class Question(
        val text: String,
        val options: List<String>
    )

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_question2)

        val questionBank = listOf(
            Question("題目1", listOf("A","B","C","D")),
            Question("題目2", listOf("A","B","C","D")),
            Question("題目3", listOf("A","B","C","D")),
            Question("題目4", listOf("A","B","C","D")),
            Question("題目5", listOf("A","B","C","D")),
            Question("題目6", listOf("A","B","C","D")),
            Question("題目7", listOf("A","B","C","D")),
            Question("題目8", listOf("A","B","C","D")),
            Question("題目9", listOf("A","B","C","D")),
            Question("題目10", listOf("A","B","C","D")),
            Question("題目11", listOf("A","B","C","D")),
            Question("題目12", listOf("A","B","C","D")),
            Question("題目13", listOf("A","B","C","D")),
            Question("題目14", listOf("A","B","C","D")),
            Question("題目15", listOf("A","B","C","D")),
            Question("題目16", listOf("A","B","C","D")),
            Question("題目17", listOf("A","B","C","D")),
            Question("題目18", listOf("A","B","C","D")),
            Question("題目19", listOf("A","B","C","D")),
            Question("題目20", listOf("A","B","C","D")),
            Question("題目21", listOf("A","B","C","D")),
            Question("題目22", listOf("A","B","C","D")),
            Question("題目23", listOf("A","B","C","D")),
            Question("題目24", listOf("A","B","C","D")),
            Question("題目25", listOf("A","B","C","D")),
            Question("題目26", listOf("A","B","C","D")),
            Question("題目27", listOf("A","B","C","D")),
            Question("題目28", listOf("A","B","C","D")),
            Question("題目29", listOf("A","B","C","D")),
            Question("題目30", listOf("A","B","C","D")),
            )

        randomQuestions = questionBank.shuffled().take(totalQuestionsToShow)

        val question = Question(
            text = "Question",
            options = listOf()
        )

        fun showQuestion(question: Question){
            val question = findViewById<TextView>(R.id.question)
            val radioButton = findViewById<RadioButton>(R.id.radioButton)
            val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
            val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
            val radioButton4 = findViewById<RadioButton>(R.id.radioButton4)
            question.text = question.text
        }


        showQuestion(randomQuestions[currentQuestionIndex])
        progressBar = findViewById(R.id.progressBar)
        progressBar.max= totalQuestionsToShow
        progressBar.progress = currentQuestionIndex + 1


        val btnReturn = findViewById<Button>(R.id.btn_return)
        val btnNext = findViewById<Button>(R.id.btn_next)
        val btnBackto1 = findViewById<Button>(R.id.btn_backto1)
        val radioButton = findViewById<RadioButton>(R.id.radioButton)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val radioButton4 = findViewById<RadioButton>(R.id.radioButton4)





        btnNext.setOnClickListener {
            if(currentQuestionIndex < totalQuestionsToShow -1){
                currentQuestionIndex++
                progressBar.progress = currentQuestionIndex +1
                showQuestion(randomQuestions[currentQuestionIndex])
            }else{
                val intent = Intent(this, MainActivityEnd::class.java)
                startActivity(intent)
                finish()
            }
        }


        btnReturn.setOnClickListener {
            if (currentQuestionIndex > 0){
                currentQuestionIndex--
                progressBar.progress = currentQuestionIndex +1
                showQuestion(randomQuestions[currentQuestionIndex])
            }
        }


        btnBackto1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}









