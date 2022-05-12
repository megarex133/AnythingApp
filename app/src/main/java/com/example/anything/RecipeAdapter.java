package com.example.anything;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeViewHolder>{

    private Context mContext;
    private List<RecipesData>  recipesList;

    public RecipeAdapter(Context mContext, List<RecipesData> recipesList) {
        this.mContext = mContext;
        this.recipesList = recipesList;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);

        return new RecipeViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {

        holder.imageView.setImageResource(recipesList.get(position).getItemImage());
        holder.mTitle.setText(recipesList.get(position).getItemName());

    }

    @Override
    public int getItemCount() { return recipesList.size();}
}
class RecipeViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView mTitle;
    CardView mCardView;

    public RecipeViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.recipe_item_image);
        mTitle = itemView.findViewById(R.id.recipe_item_title);

        mCardView = itemView.findViewById(R.id.recipe_item);


    }
}
