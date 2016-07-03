package com.example.android.miwok;

/**
 * Created by kingakimbrel on 7/2/16.
 */
public class Word {
    private String mWord;
    private String mDefaultTrans;

    public Word(String word, String defaultTrans) {
        this.mWord = word;
        this.mDefaultTrans = defaultTrans;
    }

    public String getWord() {
        return this.mWord;
    }

    public String getDefaultTrans() {
        return this.mDefaultTrans;
    }
}
