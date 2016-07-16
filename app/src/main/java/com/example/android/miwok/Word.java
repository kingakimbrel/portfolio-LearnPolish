package com.example.android.miwok;

/**
 * Created by kingakimbrel on 7/2/16.
 */
public class Word {
    private String mWord;
    private String mDefaultTrans;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word(String word, String defaultTrans) {
        this.mWord = word;
        this.mDefaultTrans = defaultTrans;
    }

    public Word(String word, String defaultTrans, int audioResourceId) {
        this.mWord = word;
        this.mDefaultTrans = defaultTrans;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String word, String defaultTrans, int imageResourceId, int audioResourceId) {
        this.mWord = word;
        this.mDefaultTrans = defaultTrans;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getWord() {
        return this.mWord;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }

    public int getAudioResourceId() {
        return this.mAudioResourceId;
    }

    public String getDefaultTrans() {
        return this.mDefaultTrans;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mWord='" + mWord + '\'' +
                ", mDefaultTrans='" + mDefaultTrans + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
