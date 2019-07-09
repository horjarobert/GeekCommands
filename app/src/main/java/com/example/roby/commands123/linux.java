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

public class linux extends AppCompatActivity {

    private Button linux_btn;

    private CardView Cardlayout_1, Cardlayout_2, Cardlayout_3, Cardlayout_4, Cardlayout_5, Cardlayout_6, Cardlayout_7, Cardlayout_8, Cardlayout_9, Cardlayout_10, Cardlayout_11, Cardlayout_12, Cardlayout_13, Cardlayout_14, Cardlayout_15, Cardlayout_16;

    private GridLayout gridLayout;

    private ImageView day_app, night_app;

    private TextView title, txt_1, txt_2, txt_3, txt_4, txt_5, txt_6, txt_7, txt_8, txt_9, txt_10, txt_11, txt_12, txt_13, txt_14, txt_15, txt_16;

    private Animation anim_title, anim_lay1, anim_lay2, anim_lay3, anim_lay4, anim_lay5, anim_lay6, anim_lay7, anim_lay8, anim_lay9, anim_lay10, anim_lay11, anim_lay12, anim_lay13, anim_lay14, anim_lay15, anim_lay16, anim_night, anim_cmdbtn;

    private RelativeLayout topLayout;

    private LinearLayout layout_1, layout_2, layout_3, layout_4, layout_5, layout_6, layout_7, layout_8, layout_9, layout_10, layout_11, layout_12, layout_13, layout_14, layout_15, layout_16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);


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
        linux_btn = (Button) findViewById(R.id.linux_btn);

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
        anim_night = AnimationUtils.loadAnimation(this, R.anim.top_btns_left_to_right);

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

        linux_btn.setAnimation(anim_cmdbtn);
        night_app.setAnimation(anim_night);


        //change all background+layouts/text color with night/day
        night_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day_app.setVisibility(View.VISIBLE);
                night_app.setVisibility(View.INVISIBLE);

                topLayout.setBackgroundResource(R.drawable.day_linux_grid_background);
                gridLayout.setBackgroundResource(R.drawable.day_linux_grid_background);

                layout_1.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_2.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_3.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_4.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_5.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_6.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_7.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_8.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_9.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_10.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_11.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_12.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_13.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_14.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_15.setBackgroundResource(R.drawable.linux_day_background_layouts);
                layout_16.setBackgroundResource(R.drawable.linux_day_background_layouts);

                txt_1.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_2.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_3.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_4.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_5.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_6.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_7.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_8.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_9.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_10.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_11.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_12.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_13.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_14.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_15.setTextColor(getResources().getColor(R.color.colorLinuxDayText));
                txt_16.setTextColor(getResources().getColor(R.color.colorLinuxDayText));


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

                layout_1.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_2.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_3.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_4.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_5.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_6.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_7.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_8.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_9.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_10.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_11.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_12.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_13.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_14.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_15.setBackgroundResource(R.drawable.linux_background_layouts);
                layout_16.setBackgroundResource(R.drawable.linux_background_layouts);


                txt_1.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_2.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_3.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_4.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_5.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_6.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_7.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_8.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_9.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_10.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_11.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_12.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_13.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_14.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_15.setTextColor(getResources().getColor(R.color.colorLinuxNightText));
                txt_16.setTextColor(getResources().getColor(R.color.colorLinuxNightText));

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
        info.setMessage("\nHere you will find LINUX commands, some of them are basic for a daily job, and some of them are just for fun or growing knowledge... \nFor this commands you should be able to use LINUX terminal (Debian/Kali Linux/Ubuntu).\n\nTip: If you want to know more tricks about a command, put 'man' before your command, for example 'man echo' and you will find more about 'echo' command.")
                .setPositiveButton("Enjoy!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("{-.-} LINUX commands || basic info")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();

    }

    //go to MainActivity
    public void goMain(View v){
        Toast.makeText( this, "geek commands", Toast.LENGTH_LONG).show();

        Intent spreMain = new Intent(linux.this, MainActivity.class);
        startActivity(spreMain);
    }

    //make layouts|cardview to open alert dialog
    public void lay1_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\nWith 'alias' command is a shell builtin, type alias and you'll see a list of alias commands...\nYou can create one, for example, if you want to make an alias for 'pwd' command, type 'alias newCommand=pwd'.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("alias")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay2_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'apg' command generate several random passwords; type 'apg', press 'Enter' key, then type few characters, randomly...now you press 'Enter' key and you'll have 6 passwords.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("apg")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay3_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'cal' display a calendar with the current day marked.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("cal")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay4_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'df -h' report file system disk space usage in human readable format.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("df -h")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay5_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\necho -e \'\\e[32m\' make the terminal text green. But if you'll type 'ls' command, the entire 'magic' will disappear, and you'll come back to white text...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("echo -e \'\\e[32m\'")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay6_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'grep' command print lines mathcing a pattern, where [...] is your pattern and file where to search... For example, list all lines from 'example.doc' file which have the letter 'a': grep a example.doc.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("grep [...]")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay7_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'kill -l' list the available signal choice in a nice table.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("kill -l")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay8_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'ls -lsSh' list contents in the current directory; -l is for a long list format, -s is to print the allocated size, -S it to sort by file size, and -h is to print sizes in human readable format.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("ls -lsSh")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay9_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'lsof' command list open files in a professional mode.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("lsof")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay10_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'man man' open the reference manual for 'man' command. 'man' is an interface to the online reference manuals.Use it with every commands... for example, if you want to know more about a command, type first 'man', then the command, 'man echo', or 'man apg', or 'man man'.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("man man")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay11_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'PS1' is the terminal promt string 1, and you can modify it, for example, PS1='new#: ', now your terminal first string will be changed... After you close the terminal, it will come back to the initial state when you open again the terminal...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("PS1=[...]")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay12_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'top' command display Linux tasks in Live Mode.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("top")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay13_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'uname -a' print all information about your sytem.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("uname -a")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay14_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'w' command show who is logged on and what they are doing.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("w")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay15_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'xdg-open' open file or URL in the user's preferred application. Example: 'xdg-open Documents' - open Documents folder (if it is in your current working directory...), 'xdg-open https://www.google.com' - open Google homepage.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("xdg-open")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay16_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'yes' command output a string repeatedly until killed. For example, type 'yes aloha' and you'll have an infinite 'aloha' in your terminal...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("yes [...]")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

}
