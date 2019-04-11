package com.train;

public class Box  {

    float mLength;
    float mWidth;
    int mHeight;

    public Box(float mLength, float mWidth, int mHeight) {
        this.mLength = mLength;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    public boolean validate(float length , float width , int height){
        if (length <= mLength && width <= mWidth && height<=mHeight){
            return true;
        }
        return false;
    }
}
