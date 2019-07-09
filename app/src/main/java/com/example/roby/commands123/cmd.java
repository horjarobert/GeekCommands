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

public class cmd extends AppCompatActivity {

    private Button cmd_btn;

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
        setContentView(R.layout.activity_cmd);


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
        cmd_btn = (Button) findViewById(R.id.cmd_btn);

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

        cmd_btn.setAnimation(anim_cmdbtn);
        night_app.setAnimation(anim_night);


        //change all background+layouts/text color with night/day
        night_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day_app.setVisibility(View.VISIBLE);
                night_app.setVisibility(View.INVISIBLE);

                topLayout.setBackgroundResource(R.drawable.day_cmd_top_background);
                gridLayout.setBackgroundResource(R.drawable.day_cmd_grid_background);

                layout_1.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_2.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_3.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_4.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_5.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_6.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_7.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_8.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_9.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_10.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_11.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_12.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_13.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_14.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_15.setBackgroundResource(R.drawable.cmd_day_background_layouts);
                layout_16.setBackgroundResource(R.drawable.cmd_day_background_layouts);

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

                layout_1.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_2.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_3.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_4.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_5.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_6.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_7.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_8.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_9.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_10.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_11.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_12.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_13.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_14.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_15.setBackgroundResource(R.drawable.cmd_background_layouts);
                layout_16.setBackgroundResource(R.drawable.cmd_background_layouts);


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
        info.setMessage("\nIn this page you will find some relevant commands in CMD as a geek... Not all are 'awesome' but I hope you will learn something useful for daily job, for fun or just for your brain.\nNow, open 'cmd.exe'/Command Prompt from your Windows OS (CMD is available only in Windows Operating System), then TRY & LEARN.\n\nTip: after each command you can write '/?' to get some info about that command. Example: arp /?")
                .setPositiveButton("Enjoy!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("[0_0] CMD commands || basic info")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();

    }

    //go to MainActivity
    public void goMain(View v){
        Toast.makeText( this, "geek commands", Toast.LENGTH_LONG).show();

        Intent spreMain = new Intent(cmd.this, MainActivity.class);
        startActivity(spreMain);
    }

    //make layouts|cardview to open alert dialog
    public void lay1_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'arp' command display current ARP (Address Resolution Protocol) cache tables for all interfaces. \nYou can use '-g' instead '-a'...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("arp -a")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay2_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'assoc' displays or modifies file extension association.\nIf you type 'assoc' without any argument (for example '/?' is an argument for help...) it will display the current file associations available for your OS.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("assoc")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay3_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'cipher' display or alter the encryption of directories/files on NTFS(New Technology File System) partitions.\nUsed without any argument it will display the encryption state of the current working directory (write 'pwd' command to see your current working directory) and any files it contains. ")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("cipher")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay4_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'cls' command is to clear the screen.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("cls")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay5_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'doskey /h' display all commands stored in memory (your CMD history).")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("doskey /h")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay6_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'driverquery' command display a list of installed device drivers.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("driverquery")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay7_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'ipconfig' display the IP address, subnet mask and default gateway for all adapters bound to TCP/IP.\nUse 'ipconfig /flushdns' to purge the DNS Resolver cache.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("ipconfig")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay8_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'netstat' command display protocol statistics and current TCP/IP network connections.\nTry 'netstat -es', 'e' for Ethernet statistics, 's' for pre-protocol statistics.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("netstat")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay9_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'ping [..]', [...] can be a web address, for example 'ping geek123.geek' or an IP address, 'ping 127.0.0.1'... \n'ping' is used to verify the connection from your device to a web address or to check for network errors.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("ping [...]")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay10_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'powercfg /a' display a list of available states of your system.\nYou can try 'powercfg /l' to list all power schemes, and 'powercfg /q' to display the content of a power scheme.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("powercfg /a")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay11_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'sfc /scannow' scan integrity of all protected system files and repairs files with problems when possible.\n\n*** You must run CMD with administrator privilege.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("sfc /scannow")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay12_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'systeminfo' command is to display operating system configuration.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("systeminfo")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay13_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'tasklist' display a list of currently running processes on either a local or remote machine.")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("tasklist")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay14_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'title [...]', where '[...]' is a string; set the window title for the command prompt window.\nTry 'title Geek', and now you'll see your new command prompt title...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("title [...]")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }

    public void lay15_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'tree' display the folder structure of a drive or path (most used for current working directory)")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("tree")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }
    public void lay16_dialog(View v){
        //make alert dialog
        AlertDialog.Builder info = new AlertDialog.Builder(this);
        info.setMessage("\n'vol' display the disk volume label and serial number for the current working disk volume...")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        hideNavigationBar();

                    }
                })
                .setCancelable(false)
                .setTitle("vol")
                .create();
        info.show();

        //navbar-fullscreen
        hideNavigationBar();
    }




}
