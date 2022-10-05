package com.example.affirmations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private final Context context;
    private final List<Affirmation> dataset;

    @NotNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemAdapter.ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NotNull ItemAdapter.ItemViewHolder holder, int position) {
        Affirmation item = dataset.get(position);
        holder.textView.setText(context.getResources().getString(item.getStringResourceId()));
        holder.imageView.setImageResource(item.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public ItemAdapter(@NotNull Context context, @NotNull List dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;
        public ItemViewHolder(@NotNull View view) {
            super(view);
            this.textView = view.findViewById(R.id.item_title);
            this.imageView = view.findViewById(R.id.item_image);
        }
    }
}