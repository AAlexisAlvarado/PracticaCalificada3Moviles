package pe.edu.tecsup.sugarormapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.tecsup.sugarormapp.R;
import pe.edu.tecsup.sugarormapp.repositories.UserRepository;

public class RegisterUserActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText fullnamesInput;
    private EditText emailsInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.register_user_title);
        setContentView(R.layout.activity_register_user);

        usernameInput = (EditText)findViewById(R.id.username_input);
        fullnamesInput = (EditText)findViewById(R.id.fullname_input);
        emailsInput = (EditText)findViewById(R.id.emails_input);
        passwordInput = (EditText)findViewById(R.id.password_input);
    }

    public void callRegister(View view){
        String username = usernameInput.getText().toString();
        String fullnames = fullnamesInput.getText().toString();
        String emails = emailsInput.getText().toString() ;
        String password = passwordInput.getText().toString();

        if(username.isEmpty() || fullnames.isEmpty() ||  emails.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Necesitas completar estos campos", Toast.LENGTH_SHORT).show();
            return;
        }

        UserRepository.create(username, fullnames , emails, password);

        finish();
    }
}
