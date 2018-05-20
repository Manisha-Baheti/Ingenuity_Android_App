package com.google.firebase.codelab.friendlychat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class coreTeam extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_team);
        imageView1= (ImageView) findViewById(R.id.naman);
        imageView2= (ImageView) findViewById(R.id.saloni);
        imageView3= (ImageView) findViewById(R.id.ojaswi);
        imageView4= (ImageView) findViewById(R.id.tulika);
        imageView5= (ImageView) findViewById(R.id.pavan);
        loadImageUrl("https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/19105895_1589568291084958_9102486102792397908_n.jpg?oh=fc521153842b9951545cd48ca106fb61&oe=5A9FFFA8",imageView1);
        loadImageUrl("https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/17861946_1469105063108459_2308138133232691990_n.jpg?oh=8d6c374bf2f763e61db79135d0802752&oe=5A6B3539",imageView2);
        loadImageUrl("https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/23843402_1368525599925620_4174076923571855633_n.jpg?oh=a274d94f4f035d2f926185bfd03c7c78&oe=5AA475A6",imageView3);
        loadImageUrl("https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/17202746_1358669940842834_8647542401355575714_n.jpg?oh=3390b60aaa98fecd6c327392152c0ed8&oe=5AA908C9",imageView4);
        loadImageUrl("https://scontent-bom1-1.xx.fbcdn.net/v/t1.0-9/15135888_1325019407530928_4418782747648332620_n.jpg?oh=1802895b9a0ee8c39fcf032b44fab3e8&oe=5A70A8B1",imageView5);
    }


    public void onClick_Core(View view) {


        switch (view.getId()) {
            case R.id.nf: {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ingenuity.NU/"));
                startActivity(facebookIntent);
                break;
            }
            case R.id.sf:{
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saloni.sachdeva.98"));
                startActivity(facebookIntent);
                break;
            }
            case R.id.tf:{
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ingenuity.NU/"));
                startActivity(facebookIntent);
                break;
            }
            case R.id.of:{
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ingenuity.NU/"));
                startActivity(facebookIntent);
                break;
            }
            case R.id.pf:{
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ingenuity.NU/"));
                startActivity(facebookIntent);
                break;
            }
        }
    }
    private void loadImageUrl(String url, ImageView imageView) {

        Picasso.with(this).load(url).into(imageView);
    }
}
