package pe.edu.tecsup.sugarormapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pe.edu.tecsup.sugarormapp.R;
import pe.edu.tecsup.sugarormapp.models.User;

/**
 * Created by Alumno on 20/04/2018.
 */

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder> {

    private List<User> users;

    public ProductoAdapter(List<User> users){
        this.users=users;
    }

    public void setUsers(List<User> users){
        this.users=users;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView fullname;
        public TextView category;
        public TextView precio;
        public TextView description;

        public ViewHolder(View itemView){
            super(itemView);
            fullname = (TextView) itemView.findViewById(R.id.fullname_input);
            category = (TextView) itemView.findViewById(R.id.category_input);
            precio = (TextView) itemView.findViewById(R.id.precio_input);
            description = (TextView) itemView.findViewById(R.id.description_input);
        }
    }

    @Override
    public ProductoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductoAdapter.ViewHolder viewHolder, int position) {
//        User user = this.users.get(position);
//        viewHolder.fullname.setText(user.getFullname());
//        viewHolder.category.setText(user.getCategory());
//        viewHolder.precio.setText(user.getPrecio());
//        viewHolder.description.setText(user.getDescription());

    }

    @Override
    public int getItemCount() {
        return this.users.size();
    }

}
