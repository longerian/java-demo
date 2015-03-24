package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by huifeng.hxl on 2015/3/5.
 */
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

//    public void setSpellChecker(SpellChecker spellChecker) {
//        System.out.println("Inside setSpellChecker." );
//        this.spellChecker = spellChecker;
//    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
