package pe.edu.tecsup.sugarormapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.tecsup.sugarormapp.repositories.ProductRepository;
import pe.edu.tecsup.sugarormapp.R;

public class RegisterProductoActivity extends AppCompatActivity {

    private EditText fullnameInput;
    private EditText categoryInput;
    private EditText precioInput;
    private EditText descriptionInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.register_product_title);
        setContentView(R.layout.activity_register);

        fullnameInput = (EditText)findViewById(R.id.fullname_input);
        categoryInput = (EditText)findViewById(R.id.category_input);
        precioInput = (EditText)findViewById(R.id.precio_input);
        descriptionInput = (EditText)findViewById(R.id.description_input);
    }

    public void callRegister(View view){
        String fullname = fullnameInput.getText().toString();
        String category = categoryInput.getText().toString();
        Double precio = Double.parseDouble( precioInput.getText().toString() );
        String description = descriptionInput.getText().toString();

        if(fullname.isEmpty() || category.isEmpty() ||  precioInput.getText().toString().isEmpty() || description.isEmpty()){
            Toast.makeText(this, "Necesitas completar estos campos", Toast.LENGTH_SHORT).show();
            return;
        }

        ProductRepository.create(fullname, category , precio, description);

        finish();

    }
}
