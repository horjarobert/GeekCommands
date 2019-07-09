package com.example.roby.commands123;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class powerShell extends AppCompatActivity {

    private Button powerShell_btn;

    private CardView Cardlayout_1, Cardlayout_2, Cardlayout_3, Cardlayout_4, Cardlayout_5, Cardlayout_6, Cardlayout_7, Cardlayout_8, Cardlayout_9, Cardlayout_10, Cardlayout_11, Cardlayout_12, Cardlayout_13, Cardlayout_14, Cardlayout_15, Cardlayout_16;

    private GridLayout gridLayout;

    private ImageView day_app, night_app;

    private TextView title, txt_1, txt_2, txt_3, txt_4, txt_5, txt_6, txt_7, txt_8, txt_9, txt_10, txt_11, txt_12, txt_13, txt_14, txt_15, txt_16;

    private Animation anim_title, anim_lay1, anim_lay2, anim_lay3, anim_lay4, anim_lay5, anim_lay6, anim_lay7, anim_lay8, anim_lay9, anim_lay10, anim_lay11, anim_lay12, anim_lay13, anim_lay14, anim_lay15, anim_lay16, anim_night, anim_cmdbtn, anim_day;

    private RelativeLayout topLayout;

    private LinearLayout layout_1, layout_2, layout_3, layout_4, layout_5, layout_6, layout_7, layout_8, layout_9, layout_10, layout_11, layout_12, layout_13, layout_14, layout_15, layout_16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_shell);


        //navbar-fullscreen
        hideNavigationBar();

        //initialize GridLayout
        gridLayout = (GridLayout) findViewById(R.id.grid_layout);

        //initialize ImageView
        day_app = (ImageView) findViewById(R.id.day_app);
        night_app = (ImageView) findViewById(R.id.night_app);

        //initialize CardView as layout
        Cardlayout_1 = (CardView) findViewById(R.id.Cardlayout_1);
        Cardlayout_2 = (CardView) findViewById(R.id.Cardlayout_2);
        Cardlayout_3 = (CardView) findViewById(R.id.Cardlayout_3);
        Cardlayout_4 = (CardView) findViewById(R.id.Cardlayout_4);
        Cardlayout_5 = (CardView) findViewById(R.id.Cardlayout_5);
        Cardlayout_6 = (CardView) findViewById(R.id.Cardlayout_6);
        Cardlayout_7 = (CardView) findViewById(R.id.Cardlayout_7);
        Cardlayout_8 = (CardView) findViewById(R.id.Cardlayout_8);
        Cardlayout_9 = (CardView) findViewById(R.id.Cardlayout_9);
        Cardlayout_10 = (CardView) findViewById(R.id.Cardlayout_10);
        Cardlayout_11 = (CardView) findViewById(R.id.Cardlayout_11);
        Cardlayout_12 = (CardView) findViewById(R.id.Cardlayout_12);
        Cardlayout_13 = (CardView) findViewById(R.id.Cardlayout_13);
        Cardlayout_14 = (CardView) findViewById(R.id.Cardlayout_14);
        Cardlayout_15 = (CardView) findViewById(R.id.Cardlayout_15);
        Cardlayout_16 = (CardView) findViewById(R.id.Cardlayout_16);

        //initialize LinearLayout as layout
        layout_1 = (LinearLayout) findViewById(R.id.layout_1);
        layout_2 = (LinearLayout) findViewById(R.id.layout_2);
        layout_3 = (LinearLayout) findViewById(R.id.layout_3);
        layout_4 = (LinearLayout) findViewById(R.id.layout_4);
        layout_5 = (LinearLayout) findViewById(R.id.layout_5);
        layout_6 = (LinearLayout) findViewById(R.id.layout_6);
        layout_7 = (LinearLayout) findViewById(R.id.layout_7);
        layout_8 = (LinearLayout) findViewById(R.id.layout_8);
        layout_9 = (LinearLayout) findViewById(R.id.layout_9);
        layout_10 = (LinearLayout) findViewById(R.id.layout_10);
        layout_11 = (LinearLayout) findViewById(R.id.layout_11);
        layout_12 = (LinearLayout) findViewById(R.id.layout_12);
        layout_13 = (LinearLayout) findViewById(R.id.layout_13);
        layout_14 = (LinearLayout) findViewById(R.id.layout_14);
        layout_15 = (LinearLayout) findViewById(R.id.layout_15);
        layout_16 = (LinearLayout) findViewById(R.id.layout_16);

        //initialize RelativeLayout
        topLayout = (RelativeLayout) findViewById(R.id.top_layout);

        //initialize TextView
        title = (TextView) findViewById(R.id.title);
        txt_1 = (TextView) findViewById(R.id.txt_1);
        txt_2 = (TextView) findViewById(R.id.txt_2);
        txt_3 = (TextView) findViewById(R.id.txt_3);
        txt_4 = (TextView) findViewById(R.id.txt_4);
        txt_5 = (TextView) findViewById(R.id.txt_5);
        txt_6 = (TextView) findViewById(R.id.txt_6);
        txt_7 = (TextView) findViewById(R.id.txt_7);
        txt_8 = (TextView) findViewById(R.id.txt_8);
        txt_9 = (TextView) findViewById(R.id.txt_9);
        txt_10 = (TextView) findViewById(R.id.txt_10);
        txt_11 = (TextView) findViewById(R.id.txt_11);
        txt_12 = (TextView) findViewById(R.id.txt_12);
        txt_13 = (TextView) findViewById(R.id.txt_13);
        txt_14 = (TextView) findViewById(R.id.txt_14);
        txt_15 = (TextView) findViewById(R.id.txt_15);
        txt_16 = (TextView) findViewById(R.id.txt_16);

        //initialize Button
        powerShell_btn = (Button) findViewById(R.id.powerShell_btn);

        //set animations
        anim_title = AnimationUtils.loadAnimation(this, R.anim.bigger_choose);

        anim_lay1 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay2 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay3 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay4 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay5 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay6 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay7 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay8 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay9 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay10 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay11 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay12 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay13 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay14 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);
        anim_lay15 = AnimationUtils.loadAnimation(this, R.anim.cmd_left_to_right);
        anim_lay16 = AnimationUtils.loadAnimation(this, R.anim.cmd_right_to_left);

        anim_cmdbtn = AnimationUtils.loadAnimation(this, R.anim.top_btns_right_to_left);
        //anim_night = AnimationUtils.loadAnimation(this, R.anim.top_btns_left_to_right);
        anim_day = AnimationUtils.loadAnimation(this, R.anim.top_btns_left_to_right);

        Cardlayout_1.setAnimation(anim_lay1);
        Cardlayout_2.setAnimation(anim_lay2);
        Cardlayout_3.setAnimation(anim_lay3);
        Cardlayout_4.setAnimation(anim_lay4);
        Cardlayout_5.setAnimation(anim_lay5);
        Cardlayout_6.setAnimation(anim_lay6);
        Cardlayout_7.setAnimation(anim_lay7);
        Cardlayout_8.setAnimation(anim_lay8);
        Cardlayout_9.setAnimation(anim_lay9);
        Cardlayout_10.setAnimation(anim_lay10);
        Cardlayout_11.setAnimation(anim_lay11);
        Cardlayout_12.setAnimation(anim_lay12);
        Cardlayout_13.setAnimation(anim_lay13);
        Cardlayout_14.setAnimation(anim_lay14);
        Cardlayout_15.setAnimation(anim_lay15);
        Cardlayout_16.setAnimation(anim_lay16);

        powerShell_btn.setAnimation(anim_cmdbtn);
        day_app.setAnimation(anim_day);


        //change all background+layouts/text color with night/day
        night_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day_app.setVisibility(View.VISIBLE);
                night_app.setVisibility(View.INVISIBLE);

                topLayout.setBackgroundResource(R.drawable.day_powershell_grid_background);
                gridLayout.setBackgroundResource(R.drawable.day_powershell_grid_background);

                layout_1.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_2.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_3.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_4.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_5.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_6.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_7.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_8.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_9.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_10.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_11.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_12.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_13.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_14.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_15.setBackgroundResource(R.drawable.powershell_day_background_layouts);
                layout_16.setBackgroundResource(R.drawable.powershell_day_background_layouts);

                txt_1.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_2.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_3.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_4.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_5.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_6.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_7.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_8.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_9.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_10.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_11.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_12.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_13.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_14.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_15.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));
                txt_16.setTextColor(getResources().getColor(R.color.colorPowerShellDayText));


                //navbar-fullscreen
                hideNavigationBar();
            }
        });

        day_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                night_app.setVisibility(View.VISIBLE);
                day_app.setVisibility(View.INVISIBLE);

                topLayout.setBackgroundResource(R.drawable.night_top_background);
                gridLayout.setBackgroundResource(R.drawable.night_grid_background);

                layout_1.setBackgroundResource(R.drawable.powershell_night_background);
                layout_2.setBackgroundResource(R.drawable.powershell_night_background);
                layout_3.setBackgroundResource(R.drawable.powershell_night_background);
                layout_4.setBackgroundResource(R.drawable.powershell_night_background);
                layout_5.setBackgroundResource(R.drawable.powershell_night_background);
                layout_6.setBackgroundResource(R.drawable.powershell_night_background);
                layout_7.setBackgroundResource(R.drawable.powershell_night_background);
                layout_8.setBackgroundResource(R.drawable.powershell_night_background);
                layout_9.setBackgroundResource(R.drawable.powershell_night_background);
                layout_10.setBackgroundResource(R.drawable.powershell_night_background);
                layout_11.setBackgroundResource(R.drawable.powershell_night_background);
                layout_12.setBackgroundResource(R.drawable.powershell_night_background);
                layout_13.setBackgroundResource(R.drawable.powershell_night_background);
                layout_14.setBackgroundResource(R.drawable.powershell_night_background);
                layout_15.setBackgroundResource(R.drawable.powershell_night_background);
                layout_16.setBackgroundResource(R.drawable.powershell_night_background);


                txt_1.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_2.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_3.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_4.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_5.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_6.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_7.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_8.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_9.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_10.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_11.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_12.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_13.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_14.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_15.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));
                txt_16.setTextColor(getResources().getColor(R.color.colorPowerShellNightText));

                //navbar-fullscreen
                hideNavigationBar();

            }
        });

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

    //make title appear after pressing button
    public void appearTitle(View view){


        title.setVisibility(View.VISIBLE);
        title.setAnimation(anim_title);

        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\nSome powerful PowerShell commands, all commands are case-insensitive, you can type them with capital letters or not...\nUse PowerShell terminal to use these commands.\n\nTip:If you want to find more info, type 'help' before the command and you'll find more interesting remarks.")
                .setPositiveButton("Enjoy!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle(".)(. PowerShell commands || basic info")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();

    }

    //go to MainActivity
    public void goMain(View v){
        Toast.makeText( this, "geek commands", Toast.LENGTH_LONG).show();

        Intent spreMain = new Intent(powerShell.this, MainActivity.class);
        startActivity(spreMain);
    }

    //make layouts|cardview to open alert dialog
    public void lay1_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Exit' exit the current PowerShell session.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Exit")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay2_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Alias' get a list with all aliases. command generate several random passwords; type 'apg', press 'Enter' key, then type few characters, randomly...now you press 'Enter' key and you'll have 6 passwords.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Alias")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay3_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Command' display a list of all commands.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Command")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay4_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Culture' get region information (language and keyboard layout)  report file system disk space usage in human readable format.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Culture")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay5_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("'Get-Date' display the current date.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Date")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay6_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-History' get a list of the session history.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-History")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay7_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Module' get the module imported to the session.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Module")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay8_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Process' get a list of processes on a machine.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Process")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay9_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-PSDrive' get drive information.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-PSDrive")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay10_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Random' get a random number.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Random")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay11_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-Service' display a list with all services, even they are running or stopped.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-Service")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay12_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Get-StartApps' display a list of all starting apps.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Get-StartApps")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay13_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Show-Command' display a dialog box with all commands from any modules.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Show-Command")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay14_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Show-EventLog' display an event log in Event Viewer.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Show-EventLog")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay15_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Start-Transcript' start a transcript of a command shell session, you can specify a text file to copy the entire session: Start-Transcript C:\\C:\\Users\\Public\\session.txt.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Start-Transcript")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay16_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'Stop-Process' command stop a process by ID. Example: 10422 is the ID for firefox.exe; Stop-Process -ID 10422.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("Stop-Process")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

}
