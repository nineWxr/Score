package com.nine.score;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {

    private static final String TAG = "MainViewModel";
    @SuppressLint("StaticFieldLeak")
    Context context;

    public MutableLiveData<Integer> ANumber;
    public MutableLiveData<Integer> BNumber;
    public int aBack = 0;
    public int bBack = 0;

    public MainViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public MutableLiveData<Integer> getANumber() {
        if (ANumber == null){
            ANumber = new MutableLiveData<>();
            ANumber.setValue(0);
        }
        return ANumber;
    }

    public MutableLiveData<Integer> getBNumber() {
        if (BNumber == null){
            BNumber = new MutableLiveData<>();
            BNumber.setValue(0);
        }
        return BNumber;
    }

    public void addAScore(int score){
        aBack = ANumber.getValue();
        bBack = BNumber.getValue();
        ANumber.setValue(ANumber.getValue() + score);
    }

    public void addBScore(int score){
        aBack = ANumber.getValue();
        bBack = BNumber.getValue();
        BNumber.setValue(BNumber.getValue() + score);
    }

    public void reSetScore(){
        aBack = ANumber.getValue();
        bBack = BNumber.getValue();
        ANumber.setValue(0);
        BNumber.setValue(0);
    }

    public void revertScore(){
        ANumber.setValue(aBack);
        BNumber.setValue(bBack);
    }

}
