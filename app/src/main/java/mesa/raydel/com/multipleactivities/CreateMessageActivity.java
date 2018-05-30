package mesa.raydel.com.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        // grab the contents of the message
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, ReceivedMessageActivity.class);

        // pass the message
        intent.putExtra(ReceivedMessageActivity.MESSAGE,messageText);
        startActivity(intent);
    }
}
