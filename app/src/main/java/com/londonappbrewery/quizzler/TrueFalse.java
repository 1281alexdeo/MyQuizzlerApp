package com.londonappbrewery.quizzler;

/**
 * Created by alex on 2/6/2018.
 */

public class TrueFalse {

     private int mQuestionId;
     private boolean mAnswer;

     //creating a contructor
    public TrueFalse(int questionResourceID,boolean trueOrFalse){
        mQuestionId = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(int questionId) {
        mQuestionId = questionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
