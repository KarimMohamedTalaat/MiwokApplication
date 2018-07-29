package com.example.karim.italish;

public class Word {

    private String mEnglishTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String englishTranslation, String miwokTranslation, int AudioResourceId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String englishTranslation, String miwokTranslation, int imageResourceId, int AudioResourceId) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getAudioResourceId() { return mAudioResourceId; }
}
