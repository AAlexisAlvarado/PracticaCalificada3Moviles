package pe.edu.tecsup.sugarormapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import pe.edu.tecsup.sugarormapp.adapters.ProductoAdapter;
import pe.edu.tecsup.sugarormapp.R;
import pe.edu.tecsup.sugarormapp.repositories.UserRepository;
import pe.edu.tecsup.sugarormapp.models.User;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName();

    private static final int REGISTER_FORM_REQUEST=100;

    private RecyclerView usersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurando el recycler view
        usersList=(RecyclerView)findViewById(R.id.user_list);
        usersList.setLayoutManager(new LinearLayoutManager(this));

        //Enviar datos adapter or recyclerview
        List<User> users = UserRepository.list();
        usersList.setAdapter(new ProductoAdapter(users));
    }

    public void callRegisterForm(View view){
        startActivityForResult(new Intent(this, RegisterProductoActivity.class),REGISTER_FORM_REQUEST);
    }

    //return from RegisterProductoActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        //refresh data
        ProductoAdapter adapter = (ProductoAdapter)usersList.getAdapter();

        List<User> users=UserRepository.list();
        adapter.setUsers(users);
        adapter.notifyDataSetChanged();
    }
}
