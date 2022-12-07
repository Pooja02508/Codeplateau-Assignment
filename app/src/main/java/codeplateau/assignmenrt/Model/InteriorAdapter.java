package codeplateau.assignmenrt.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import codeplateau.assignmenrt.R;

public class InteriorAdapter extends RecyclerView.Adapter<InteriorAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<InteriorModel> interiorList;

    public InteriorAdapter(Context mCtx, List<InteriorModel> interiorList) {
        this.mCtx = mCtx;
        this.interiorList = interiorList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.interior_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        InteriorModel product = interiorList.get(position);

        holder.Name.setText(product.getName());

        holder.Image.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));



    }

    @Override
    public int getItemCount() {
        return interiorList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView Name;
        ImageView Image;

        public ProductViewHolder(View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.Name);
            Image = itemView.findViewById(R.id.Image);


        }


    }

}