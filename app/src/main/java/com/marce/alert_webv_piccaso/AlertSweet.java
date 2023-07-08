package com.marce.alert_webv_piccaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class AlertSweet extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_sweet);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 =  findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 =  findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 =  findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 =  findViewById(R.id.btn9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BasicMessage();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titleWithText();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            errorMessage();
        }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            warningMessage();
        }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            successMessage();
        }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            withCustomIcon();
        }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            withConfirmButton();
        }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            withCancelButtonListener();
        }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                changeOnConfirm();

            }
        });

        }
        public void BasicMessage() {
            new SweetAlertDialog(this).setTitleText("Here's a message!").show();
        }

        public void titleWithText() {
            new SweetAlertDialog(this).setTitleText("Here's a message!").setContentText("It's pretty, isn't it?").show();
        }

        public void errorMessage() {
            new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE).setTitleText("Oops...").setContentText("Something went wrong!").show();
        }

        public void warningMessage() {
            new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure?").setContentText("Won't be able to recover this file!").setConfirmText("Yes,delete it!").show();
        }

        public void successMessage() {
            new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Good job!").setContentText("You clicked the button!").show();

        }

        public void withCustomIcon() {
            new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE).setTitleText("Sweet!").setContentText("Here's a custom image.").setCustomImage(R.drawable.ic_launcher_foreground).show();

        }

        public void withConfirmButton() {
            new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure?").setContentText("Won't be able to recover this file!").setConfirmText("Yes,delete it!").setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {@Override
            public void onClick(SweetAlertDialog sDialog) {
                // Showing simple toast message to user
                Toast.makeText(AlertSweet.this, " You Clicked me ", Toast.LENGTH_SHORT).show();

                sDialog.dismissWithAnimation();
            }
            }).show();
        }

        public void withCancelButtonListener() {
            new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure?").setContentText("Won't be able to recover this file!").setCancelText("No,cancel plx!").setConfirmText("Yes,delete it!").showCancelButton(true).setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {@Override
            public void onClick(SweetAlertDialog sDialog) {
                // Showing simple toast message to user
                Toast.makeText(AlertSweet.this, " You clicked Cancel ", Toast.LENGTH_SHORT).show();
                sDialog.cancel();
            }
            }).show();
        }

        public void changeOnConfirm() {

            new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("Are you sure?").setContentText("Won't be able to recover this file!").setConfirmText("Yes,delete it!").setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {@Override
            public void onClick(SweetAlertDialog sDialog) {
                sDialog.setTitleText("Deleted!").setContentText("Your imaginary file has been deleted!").setConfirmText("OK").setConfirmClickListener(null).changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
            }
            }).show();

        }
    }
