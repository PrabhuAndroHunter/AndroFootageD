package com.pub.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mCardBalanceEt, mYearIntrestEt, mMinimumPaymentEt;
    private EditText mFinalCardBalEt, mMonthsRemainigEt, mInterstPaid;
    private Button mComputeBtn, mClearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardBalanceEt = (EditText) findViewById(R.id.edittext_mainActivity_cardBalance);
        mYearIntrestEt = (EditText) findViewById(R.id.edittext_mainActivity_yearIntrest);
        mMinimumPaymentEt = (EditText) findViewById(R.id.edittext_mainActivity_minimumPayment);
        mFinalCardBalEt = (EditText) findViewById(R.id.edittext_mainActivity_finalCardBal);
        mMonthsRemainigEt = (EditText) findViewById(R.id.edittext_mainActivity_monthsRemainig);
        mInterstPaid = (EditText) findViewById(R.id.edittext_mainActivity_interstPaid);

        mComputeBtn = (Button) findViewById(R.id.button_mainActivity_compute);
        mClearBtn = (Button) findViewById(R.id.button_mainActivity_clear);

        mComputeBtn.setOnClickListener(this);
        mClearBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.button_mainActivity_compute:
                Toast.makeText(this, "Only UI for a Credit Card application", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button_mainActivity_clear:
                clearAllFields();
                break;
        }
    }

    private void clearAllFields() {
        clear(mCardBalanceEt);
        clear(mYearIntrestEt);
        clear(mMinimumPaymentEt);
        clear(mFinalCardBalEt);
        clear(mMonthsRemainigEt);
        clear(mInterstPaid);
    }

    private void clear(EditText editText) {
        if (editText != null)
            editText.setText("");
    }
}
