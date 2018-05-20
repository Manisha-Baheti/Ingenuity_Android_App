package com.google.firebase.codelab.friendlychat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class contactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fb: {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ingenuity.NU/"));
                startActivity(facebookIntent);
                break;
            }
            case R.id.insta: {
                Intent instaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ingenuity_fest/?hl=en/"));
                startActivity(instaIntent);
                break;
            }

        }
    }
}
