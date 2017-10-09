package uk.co.dekoorb.android.c3469162.intent101;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "extra_message";

    public static Intent createIntent(Context context, String message) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView message = (TextView) findViewById(R.id.tv_message);
        message.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
    }
}
