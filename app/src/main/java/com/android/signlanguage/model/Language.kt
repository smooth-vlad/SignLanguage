package com.android.signlanguage.model

abstract class Language {
    abstract fun getLetter(index: Int): Char
    abstract fun getIndex(letter: Char): Int
    abstract fun getDrawable(letter: Char): Int
}