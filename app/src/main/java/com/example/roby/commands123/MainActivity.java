package com.example.roby.commands123;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout main_layout;
    private LinearLayout top_layout;
    private LinearLayout middle_layout;
    private LinearLayout bottom_layout;

    private TextView txt_info;
    private TextView txt_title1;
    private TextView txt_title2;
    private TextView txt_choose;

    private Button btn_info;
    private Button btn_cmd;
    private Button btn_power;
    private Button btn_linux;

    private Animation textInfo, textTitlu1, textTitlu2, butonInfo, butonCmd, butonPower, butonLinux, layoutSus, layoutJos, textChoose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //navbar-fullscreen
        hideNavigationBar();


        //initialize layouts
        main_layout = (LinearLayout) findViewById(R.id.main_layout);
        top_layout = (LinearLayout) findViewById(R.id.top_layout);
        middle_layout = (LinearLayout) findViewById(R.id.middle_layout);
        bottom_layout = (LinearLayout) findViewById(R.id.bottom_layout);

        //initialize texts
        txt_info = (TextView) findViewById(R.id.txt_info);
        txt_title1 = (TextView) findViewById(R.id.txt_title1);
        txt_title2 = (TextView) findViewById(R.id.txt_title2);
        txt_choose = (TextView) findViewById(R.id.txt_choose);

        //initialize buttons
        btn_info = (Button) findViewById(R.id.btn_info);
        btn_cmd = (Button) findViewById(R.id.btn_cmd);
        btn_power = (Button) findViewById(R.id.btn_power);
        btn_linux = (Button) findViewById(R.id.btn_linux);

        //set animations
        //set animation
        textInfo = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        textTitlu1 = AnimationUtils.loadAnimation(this, R.anim.txt_right_to_left);
        textTitlu2 = AnimationUtils.loadAnimation(this, R.anim.txt_left_to_right);
        butonInfo = AnimationUtils.loadAnimation(this, R.anim.btn_info);
        butonCmd = AnimationUtils.loadAnimation(this, R.anim.btn_cmd);
        butonPower = AnimationUtils.loadAnimation(this, R.anim.btn_power);
        butonLinux = AnimationUtils.loadAnimation(this, R.anim.btn_linux);
        layoutSus = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        layoutJos = AnimationUtils.loadAnimation(this, R.anim.right_to_left);
        textChoose = AnimationUtils.loadAnimation(this, R.anim.bigger_choose);


        txt_title1.setAnimation(textTitlu1);
        txt_title2.setAnimation(textTitlu2);
        btn_info.setAnimation(butonInfo);
        btn_cmd.setAnimation(butonCmd);
        btn_power.setAnimation(butonPower);
        btn_linux.setAnimation(butonLinux);
        top_layout.setAnimation(layoutSus);
        bottom_layout.setAnimation(layoutJos);




    }

    //hide the navigation bar and make full screen all app
    private void hideNavigationBar(){
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }

    //when I exit for a moment from the app and I'll come back, the same effect must be continue
    @Override
    protected void onResume(){
        super.onResume();

        hideNavigationBar();
    }

    public void btnInfo(View v){



        btn_info.animate().rotation(btn_info.getRotation()+360).start();


        txt_info.setVisibility(View.VISIBLE);
        txt_info.setAnimation(textInfo);

        txt_choose.setVisibility(View.VISIBLE);
        txt_choose.setAnimation(textChoose);

        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\nHello, world! The purpose of this app is to give others some useful terminal commands (in CMD/PowerShell/Linux).\nAs a geek, this app can boost your knowledge. \n\nAll commands description used in this app are from CMD/PowerShell/Linux help page/'https://ss64.com/ps/' or from my experience.\n\n*I'm not responsible if you harm your device, all commands presented in this app have pure accuracy in accordance to legality law.\n\nArchitect - hero: horja.robert@gmail.com")
                .setPositiveButton("Enjoy!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("-_-) App info")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    //go to cmd page
    public void toCmd(View v){
        Toast.makeText( this, "CMD commands", Toast.LENGTH_LONG).show();

        Intent spreCmd = new Intent(MainActivity.this, cmd.class);
        startActivity(spreCmd);
    }

    //go to linux page
    public void toLinux(View v){
        Toast.makeText( this, "LINUX commands", Toast.LENGTH_LONG).show();

        Intent spreLinux = new Intent(MainActivity.this, linux.class);
        startActivity(spreLinux);
    }

    //go to powerShell page
    public void toPowerShell(View v){
        Toast.makeText( this, "PowerShell commands", Toast.LENGTH_LONG).show();

        Intent sprePowerShell = new Intent(MainActivity.this, powerShell.class);
        startActivity(sprePowerShell);
    }

}
