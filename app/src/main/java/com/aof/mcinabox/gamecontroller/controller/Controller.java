package com.aof.mcinabox.gamecontroller.controller;

import android.view.View;
import android.view.ViewGroup;

import com.aof.mcinabox.gamecontroller.event.BaseKeyEvent;
import com.aof.mcinabox.gamecontroller.input.Input;

public interface Controller {
    void sendKey(BaseKeyEvent event);

    int getInputCounts();

    boolean addInput(Input input);

    boolean removeInput(Input input);

    boolean removeAllInputs();

    boolean containInput(Input input);

    void setInputMode(int mode);

    void addContentView(View view, ViewGroup.LayoutParams params);

    void addView(View v);

    void typeWords(String str);
    void onStop();
    int getInputMode();
    int[] getPointer();
    void saveConfig();
}

