package com.example.quizeapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        var ques1 = Question(1,"What country does this flag belong to?",
        R.drawable.flag,
            "Ethiopia",
            "Eritrea",
            "Armenia",
            "Somali",
            1
        )
        questionsList.add(ques1)
        var ques2 = Question(1,"What country does this flag belong to?",
            R.drawable.download,
            "Ethiopia",
            "Eritrea",
            "Sudan",
            "Djibouti",
            2
        )
        questionsList.add(ques2)
        var ques3 = Question(1,"What country does this flag belong to?",
            R.drawable.sudan,
            "South Sudan",
            "Sudan",
            "Somali",
            "Eritrea",
            2
        )
        questionsList.add(ques3)
        var ques4 = Question(1,"What country does this flag belong to?",
            R.drawable.kenya,
            "Uganda",
            "Congo",
            "Kenya",
            "South Sudan",
            3
        )
        questionsList.add(ques4)
        var ques5 = Question(1,"What country does this flag belong to?",
            R.drawable.ssudan,
            "Somali",
            "Congo",
            "Kenya",
            "South Sudan",
            4
        )
        questionsList.add(ques5)
        var ques6 = Question(1,"What country does this flag belong to?",
            R.drawable.somali,
            "Somali",
            "Morocco",
            "Djibouti",
            "South Sudan",
            1
        )
        questionsList.add(ques6)
        var ques7 = Question(1,"What country does this flag belong to?",
            R.drawable.uganda,
            "Congo",
            "South Africa",
            "Uganda",
            "South Sudan",
            3
        )
        questionsList.add(ques7)
        var ques8 = Question(1,"What country does this flag belong to?",
            R.drawable.djbouti,
            "Ethiopia",
            "South Africa",
            "Uganda",
            "Djibouti",
            4
        )
        questionsList.add(ques8)
        return questionsList
    }
}