package com.nkhokhla.timer8m46s;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
//    private EditText mEditTextInput;
    private TextView mTextViewCountDown;
//    private Button mButtonSet;
    private Button mButtonStartPause;
    int i =0;
//    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mStartTimeInMillis;
    private long mTimeLeftInMillis;
    private long mEndTime;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mEditTextInput = findViewById(R.id.edit_text_input);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);
//        mButtonSet = findViewById(R.id.button_set);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        text = (TextView) findViewById(R.id.textView);
//        mButtonReset = findViewById(R.id.button_reset);
//        mButtonSet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String input = mEditTextInput.getText().toString();
//                if (input.length() == 0) {
//                    Toast.makeText(MainActivity.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                long millisInput = Long.parseLong(input) * 60000;
//                if (millisInput == 0) {
//                    Toast.makeText(MainActivity.this, "Please enter a positive number", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                setTime(millisInput);
//                mEditTextInput.setText("");
//            }
//        });
        setTime(526000);
        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });
//        mButtonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                resetTimer();
//            }
//        });
    }
    private void setTime(long milliseconds) {
        mStartTimeInMillis = milliseconds;
        resetTimer();
    }
    private void startTimer() {
        mEndTime = System.currentTimeMillis() + mTimeLeftInMillis;
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mButtonStartPause.setVisibility(View.INVISIBLE);
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                mTimerRunning = false;
                Log.d("finish", String.valueOf(i));
                mButtonStartPause.setVisibility(View.VISIBLE);
                updateWatchInterface();
            }
        }.start();
        mTimerRunning = true;
        updateWatchInterface();
    }
    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        updateWatchInterface();
    }
    private void resetTimer() {
        mTimeLeftInMillis = mStartTimeInMillis;
        updateCountDownText();
        updateWatchInterface();
    }
    private void updateCountDownText() {
        Log.d("chas", String.valueOf(i));
        if (i == 3){
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 5){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 9){
            text.setText("“Please man.”");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i ==11){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 15){
            text.setText("“I can't breathe.”");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 17){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 21){
            text.setText("“I'm about to die.”");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i ==23){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 27){
            text.setText("“I can't breathe. I can't breathe.”");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 29){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 33){
            text.setText("(Still kneeling)“Get in the car!”");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 35){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 39){
            text.setText("(Still kneeling)“Get up, get in the car!“");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 41){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 45){
            text.setText("(Still kneeling)“Get up, and get in the car!“");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 47){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 51){
            text.setText("An ambulance is called.");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 53){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i ==55){
            text.setText("“Everything hurts. Some water or something, please“");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 59){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i ==61){
            text.setText("“I can't breathe officer.“\n" +"“Shut up.“\n" +"“They gonna kill me.“\n");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i ==63){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 67){
            text.setText("“He's not responsive right now!“ -bystander");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 69){text.animate().alpha(0).setDuration(3000);}
        if (i == 73){
            text.setText("After 5 minutes and 50 seconds, George Floyd becomes unresponsive.");
            text.animate().alpha(1).setDuration(3000);
        }
        if (i == 75){
            text.animate().alpha(0).setDuration(3000);
        }
        if (i == 79){
            text.setText("“He's not fucking moving!“ -bystander");
        }
        int hours = (int) (mTimeLeftInMillis / 1000) / 3600;
        int minutes = (int) ((mTimeLeftInMillis / 1000) % 3600) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        String timeLeftFormatted;
         timeLeftFormatted = String.format(Locale.getDefault(),
                    "%02d:%02d", minutes, seconds);

        mTextViewCountDown.setText(timeLeftFormatted);
        i++;
    }
    private void updateWatchInterface() {
        if (mTimerRunning) {
//            mEditTextInput.setVisibility(View.INVISIBLE);
//            mButtonSet.setVisibility(View.INVISIBLE);
//            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setText("Pause");
        } else {
//            mEditTextInput.setVisibility(View.VISIBLE);
//            mButtonSet.setVisibility(View.VISIBLE);
            mButtonStartPause.setText("Start");
            if (mTimeLeftInMillis < 1000) {
                mButtonStartPause.setVisibility(View.INVISIBLE);
            } else {
                mButtonStartPause.setVisibility(View.VISIBLE);
            }
            if (mTimeLeftInMillis < mStartTimeInMillis) {
//                mButtonReset.setVisibility(View.VISIBLE);
            } else {
//                mButtonReset.setVisibility(View.INVISIBLE);
            }
        }
    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putLong("startTimeInMillis", mStartTimeInMillis);
//        editor.putLong("millisLeft", mTimeLeftInMillis);
//        editor.putBoolean("timerRunning", mTimerRunning);
//        editor.putLong("endTime", mEndTime);
//        editor.apply();
//        if (mCountDownTimer != null) {
//            mCountDownTimer.cancel();
//        }
//    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
//        mStartTimeInMillis = prefs.getLong("startTimeInMillis", 600000);
//        mTimeLeftInMillis = prefs.getLong("millisLeft", mStartTimeInMillis);
//        mTimerRunning = prefs.getBoolean("timerRunning", false);
//        updateCountDownText();
//        updateWatchInterface();
//        if (mTimerRunning) {
//            mEndTime = prefs.getLong("endTime", 0);
//            mTimeLeftInMillis = mEndTime - System.currentTimeMillis();
//            if (mTimeLeftInMillis < 0) {
//                mTimeLeftInMillis = 0;
//                mTimerRunning = false;
//                updateCountDownText();
//                updateWatchInterface();
//            } else {
//                startTimer();
//            }
//        }
//    }
}