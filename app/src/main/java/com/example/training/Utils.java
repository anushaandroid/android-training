package com.example.training;

import android.app.Activity;
import android.widget.Toast;

public class Utils {
    public void showMessage(Activity activity,String msg){
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }
}
