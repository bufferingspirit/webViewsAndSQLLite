package com.example.admin.webviewsandsqllite;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    Button save, display;
    EditText name, number;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = (Button) findViewById(R.id.saveData);
        display = (Button) findViewById(R.id.displayData);
        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);

        webView = (WebView) findViewById(R.id.webview);
        WebViewClient  webViewClient = new WebViewClient();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("https://developer.android.com");

        MyContact contact = new MyContact(name.getText().toString(), number.getText().toString());

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        /*databaseHelper.saveNewContact("John", "234234234");
        databaseHelper.getContacts();*/

    }

    public void saveData(View view){
        MyContact contact = new MyContact(name.getText().toString(), number.getText().toString());
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.saveNewContact(contact);
    }

    public void getData(View view){
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        List<MyContact> contacts = databaseHelper.getContacts();

        for(MyContact contact : contacts){

        }
    }
}
