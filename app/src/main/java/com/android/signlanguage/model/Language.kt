package com.android.signlanguage.model

import com.android.signlanguage.R

object Language {
    private const val firstLetter = 'A'
    val maxLetters
        get() = drawables.size

    private val drawables = arrayListOf(
        R.drawable.letter_a,
        R.drawable.letter_b,
        R.drawable.letter_c,
        R.drawable.letter_d,
        R.drawable.letter_e,
        R.drawable.letter_f,
        R.drawable.letter_g,
        R.drawable.letter_h,
        R.drawable.letter_i,
        R.drawable.letter_j,
        R.drawable.letter_k,
        R.drawable.letter_l,
    )

    fun getLetter(index: Int): Char  {
        return firstLetter + index
    }

    fun getIndex(letter: Char): Int {
        return letter - firstLetter
    }

    fun getDrawable(letter: Char): Int {
        return drawables[getIndex(letter)]
    }
}