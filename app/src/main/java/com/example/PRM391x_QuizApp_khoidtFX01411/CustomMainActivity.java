package com.example.PRM391x_QuizApp_khoidtFX01411;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.CountDownTimer;

import com.example.PRM391x_QuizApp_khoidtFX01411.R;

public class CustomMainActivity extends AppCompatActivity {

    // khai bao bien cau tra loi cua cau hoi 1
    RadioGroup rdAnswerQuizOne;
    // khai bao bien cau tra loi cua cau hoi 5
    RadioGroup rdAnswerQuizFive;
    // khai bao bien cau tra loi cua cau hoi 9
    RadioGroup rdAnswerQuizNight;

    // khai bao bien twHightScore hien thi ket qua bao tong so cau dung len man hinh
    TextView twHightScore;


    // khai bao bien cau tra loi cua cau hoi 1

    String rAnswerOptionOne;
    String rAnswerOptionTwo;
    String rAnswerOptionThree;

    // khai bao bien xu ly checkbox cau hoi 3;
    CheckBox chkAnswerOneOfQuizThree;
    CheckBox chkAnswerTwoOfQuizThree;
    CheckBox chkAnswerThreeOfQuizThree;
    CheckBox chkAnswerFourOfQuizThree;

    // khai bao bien xu ly checkbox cau hoi 7
    CheckBox chkAnswerOneOfQuizSeven;
    CheckBox chkAnswerTwoOfQuizSeven;
    CheckBox chkAnswerThreeOfSeven;
    CheckBox chkAnswerFourOfSeven;



    // khai bao bien cau tra loi cau hoi 5

    String rdOptionOneOfQuizFive;
    String rdOptionTwoOfQuizFive;
    String rdOptionThreeOfQuizFive;

    // khai bao bien cau tra loi cua cau hoi 9

    String rOptionOneOfQuizNight;
    String rOptionTwoOfQuizNight;

    // khai bao bien cau tra loi cau hoi 2
    String editTextAnswerTwo;
    // khai bao bien cau tra loi cau hoi 4
    String editTextAnswerFour;
    // khai bao bien cau tra loi cau hoi 10
    String editTextAnswerTen;
    // khai bao bien cau tra loi cau hoi 8
    String editTextAnswerEight;
    // khai bao bien cau tra loi cau hoi 6
    String editTextAnswerOneOfSix;
    String eidtTextAnswerTwoOfSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_main);

        String firstName;
        String lastName;
        TextView tv1 = findViewById(R.id.firstName);
        TextView tv2 = findViewById(R.id.lastName);
        final TextView tvTime = findViewById(R.id.tvTime);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            firstName = bundle.getString("firstName");
            lastName = bundle.getString("lastName");
            tv1.setText("First Name: "+ firstName);
            tv2.setText("Last Name: "+ lastName);
        }

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(5,0, 0, 0);

        // gan gia tri cau tra cua cau hoi 1
        rAnswerOptionOne = getResources().getString(R.string.aswer_quiz1_1);
        rAnswerOptionTwo = getResources().getString(R.string.anwer_quiz1_2);
        rAnswerOptionThree = getResources().getString(R.string.aswer_quiz1_3);

        // gan gia tri cau tra loi cua cau hoi 5

        rdOptionOneOfQuizFive = getResources().getString(R.string.aswer_5_1);
        rdOptionTwoOfQuizFive = getResources().getString(R.string.aswer_5_2);
        rdOptionThreeOfQuizFive = getResources().getString(R.string.aswer_5_3);


        editTextAnswerTwo = getResources().getString(R.string.aswer_2);
        editTextAnswerFour = getResources().getString(R.string.aswer_4);

        // gan gia tri cau tra loi cua cua hoi 6
        editTextAnswerOneOfSix = getResources().getString(R.string.aswer_6_1);
        eidtTextAnswerTwoOfSix = getResources().getString(R.string.aswer_6_2);

        TextView view = findViewById(R.id.title);
        view.setText(R.string.quiz_app);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_size));

        TextView quiz1 = findViewById(R.id.quiz1);
        quiz1.setText(R.string.quiz_1);
        quiz1.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        quiz1.setLayoutParams(lp);

        // lay id radio Group cau tra loi 1
        rdAnswerQuizOne = findViewById(R.id.rdAnswerQuizOne);
        // lay id radio Group cau tra loi 5
        rdAnswerQuizFive = findViewById(R.id.rdAnswerQuizFive);

        // lay id cac tra loi cua cau hoi 1
        final RadioButton radioAsw1 = findViewById(R.id.rAnswerOptionOne);
        radioAsw1.setText(rAnswerOptionOne);
        final RadioButton radioAsw2 = findViewById(R.id.rAnswerOptionTwo);
        radioAsw2.setText(rAnswerOptionTwo);
        final RadioButton radioAsw3 = findViewById(R.id.rAnswerOptionThree);
        radioAsw3.setText(rAnswerOptionThree);

        TextView quiz2 = findViewById(R.id.quiz2);
        quiz2.setText(R.string.quiz_2);
        quiz2.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        TextView quiz3 = findViewById(R.id.quiz3);
        quiz3.setText(R.string.quiz_3);
        quiz3.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));


        chkAnswerOneOfQuizThree = findViewById(R.id.chk1);
        chkAnswerOneOfQuizThree.setText(R.string.chk_Ribosome);

        chkAnswerTwoOfQuizThree = findViewById(R.id.chk2);
        chkAnswerTwoOfQuizThree.setText(R.string.chk_Plasimds);

        chkAnswerThreeOfQuizThree = findViewById(R.id.chk3);
        chkAnswerThreeOfQuizThree.setText(R.string.chk_Golgi);

        chkAnswerFourOfQuizThree = findViewById(R.id.chk4);
        chkAnswerFourOfQuizThree.setText(R.string.chk_Diploid);

        TextView quiz4 = findViewById(R.id.quiz4);
        quiz4.setText(R.string.quiz_4);
        quiz4.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        TextView quiz5 = findViewById(R.id.quiz5);
        quiz5.setText(R.string.quiz_5);
        quiz5.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // radio asw quiz 5

        RadioButton rd4 = findViewById(R.id.radioButton4);
        rd4.setText(rdOptionOneOfQuizFive);
        RadioButton rd5 = findViewById(R.id.radioButton5);
        rd5.setText(rdOptionTwoOfQuizFive);
        RadioButton rd6 = findViewById(R.id.radioButton6);
        rd6.setText(rdOptionThreeOfQuizFive);

        TextView quiz6 = findViewById(R.id.quiz6);
        quiz6.setText(R.string.quiz_6);
        quiz6.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // quiz 7
        TextView quiz7 = findViewById(R.id.quiz7);
        quiz7.setText(R.string.quiz_7);
        quiz7.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));
        chkAnswerOneOfQuizSeven = findViewById(R.id.chk5);
        chkAnswerOneOfQuizSeven.setText(R.string.aswer_7_1);
        chkAnswerTwoOfQuizSeven = findViewById(R.id.chk6);
        chkAnswerTwoOfQuizSeven.setText(R.string.aswer_7_2);
        chkAnswerThreeOfSeven = findViewById(R.id.chk7);
        chkAnswerThreeOfSeven.setText(R.string.aswer_7_3);
        chkAnswerFourOfSeven = findViewById(R.id.chk8);
        chkAnswerFourOfSeven.setText(R.string.aswer_7_4);

        // quiz 8
        TextView quiz8 = findViewById(R.id.quiz8);
        quiz8.setText(R.string.quiz_8);
        quiz8.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cua quiz 8
        editTextAnswerEight = getResources().getString(R.string.aswer_8);

        // quiz 9
        rdAnswerQuizNight = findViewById(R.id.rdAnswerQuizNight);
        TextView quiz9 = findViewById(R.id.quiz9);
        quiz9.setText(R.string.quiz_9);
        quiz9.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cua quiz 9
        rOptionOneOfQuizNight = getResources().getString(R.string.aswer_9_1);
        rOptionTwoOfQuizNight = getResources().getString(R.string.aswer_9_2);

        RadioButton rd7 = findViewById(R.id.radioButton7);
        rd7.setText(rOptionOneOfQuizNight);
        RadioButton rd8 = findViewById(R.id.radioButton8);
        rd8.setText(rOptionTwoOfQuizNight);

        TextView quiz10 = findViewById(R.id.quiz10);
        quiz10.setText(R.string.quiz_10);
        quiz10.setTextSize(TypedValue.COMPLEX_UNIT_SP,getResources().getDimension(R.dimen.text_quiz_size));

        // lay noi dung tra loi cau quiz 10
        editTextAnswerTen = getResources().getString(R.string.aswer_10);

        twHightScore = findViewById(R.id.score);
        final Button button = findViewById(R.id.button);
        // goi ham thoi gian
        reverseTimer(60,tvTime,button);
        // xu ly su kien button tinh tong so cau dung
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = scoreCount();
                showScore(count);
            }
        });
    }
    public void showScore(int count){

        // Set the toast and duration
       // int toastDurationInMilliSeconds = 10000;

        if(count == 10){
            String result = "Perfect, You scrored " + count + " out of 10";
            twHightScore.setText(result);
            for(int i=0;i < 30;i++){
                Toast.makeText(CustomMainActivity.this,result.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        else {
            String result = "Try again, You scrored " + count + " out of 10";
            twHightScore.setText(result);
            for(int i=0;i< 30;i++){
                Toast.makeText(CustomMainActivity.this,result.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void reverseTimer(int Seconds, final TextView tv, final Button button){

        new CountDownTimer(Seconds* 1000+1000, 1000) {

            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setText("TIME : " + String.format("%02d", minutes)
                        + ":" + String.format("%02d", seconds));
            }
            public void onFinish() {
                tv.setText("End Time");
                button.setEnabled(false);
                int count = scoreCount();
                showScore(count);
            }
        }.start();
    }
    public int scoreCount(){

        boolean check = false;
        int count = 0;
        // xu ly quiz 1
        RadioButton selectedRadioButton = findViewById(rdAnswerQuizOne.getCheckedRadioButtonId());
        String asquestion = selectedRadioButton == null ? "" : selectedRadioButton.getText().toString().trim();
        if(asquestion.equals(rAnswerOptionThree)){
            check = true;
            count++;
        }
        else if(asquestion.equals(rAnswerOptionTwo)){
            check = false;
        }
        else if(asquestion.equals(rAnswerOptionOne)){
            check = false;
        }
        // xu ly cau quiz 2
        EditText editText = findViewById(R.id.editQuiz2);
        String edasw2 = editText.getText().toString().trim();

        if(edasw2.equals(editTextAnswerTwo)){
            check = true;
            count++;
        }
        else{
            check = false;
        }

        // xu ly cau quiz 3
        if(chkAnswerOneOfQuizThree.isChecked() && chkAnswerThreeOfQuizThree.isChecked() && !chkAnswerTwoOfQuizThree.isChecked() && !chkAnswerFourOfQuizThree.isChecked()){
            check = true;
            count++;
        }

        // xu ly cau quiz 4
        EditText editTextQuiz4 = findViewById(R.id.asw4);
        String edasw4 = editTextQuiz4.getText().toString().trim();
        if(edasw4.equals(editTextAnswerFour)){
            check = true;
            count++;
        }
        else{
            check = false;
        }
        // xu ly quiz 5

        RadioButton selectedRadioButtonQuiz5 = findViewById(rdAnswerQuizFive.getCheckedRadioButtonId());
        String ansquestion5 = selectedRadioButtonQuiz5 == null ? "" : selectedRadioButtonQuiz5.getText().toString();
        if(ansquestion5.equals(rdOptionOneOfQuizFive) || ansquestion5.equals(rdOptionThreeOfQuizFive)){
            check = false;
        }
        else if(ansquestion5.equals(rdOptionTwoOfQuizFive)){
            check = true;
            count++;
        }
        // xu ly quiz 6
        EditText editQuiz6 = findViewById(R.id.editQuiz6);
        String edasq6 = editQuiz6.getText().toString().trim();
        if(edasq6.equals(editTextAnswerOneOfSix) || edasq6.equals(eidtTextAnswerTwoOfSix)){
            check = true;
            count++;
        }else{
            check = false;
        }
        // xu ly cau quiz 7
        if(chkAnswerThreeOfSeven.isChecked() && chkAnswerFourOfSeven.isChecked() && !chkAnswerOneOfQuizSeven.isChecked() && !chkAnswerTwoOfQuizSeven.isChecked()){
            check = true;
            count++;
        }
        // xu ly cau quiz 8
        EditText editQuiz8 = findViewById(R.id.editQuiz8);
        String edasq8 = editQuiz8.getText().toString().trim();
        if(edasq8.equals(editTextAnswerEight)){
            check = true;
            count++;
        }else{
            check = false;
        }
        // xu ly cau quiz 9
        RadioButton selectedRadioButtonQuiz9 = findViewById(rdAnswerQuizNight.getCheckedRadioButtonId());
        String asquestion9 = selectedRadioButtonQuiz9 == null ? "" : selectedRadioButtonQuiz9.getText().toString().trim();
        if(asquestion9.equals(rOptionTwoOfQuizNight)){
            check = true;
            count++;
        }
        else if(asquestion9.equals(rOptionOneOfQuizNight)){
            check = false;
        }
        // xu ly cau quiz 10
        EditText editQuiz10 = findViewById(R.id.editQuiz10);
        String edasq10 = editQuiz10.getText().toString().trim();
        if(edasq10.equals(editTextAnswerTen)){
            check = true;
            count++;
        }else{
            check = false;
        }
        return count;
    }
}
