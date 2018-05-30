package mesa.raydel.com.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);


        // get the intent, unpack the message and display it
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(MESSAGE);

        // get the control and display the message by assigning it to the text attrib
        TextView receivedMsgTextView = (TextView)findViewById(R.id.received_msg);
        receivedMsgTextView.setText(messageText);
    }
}
