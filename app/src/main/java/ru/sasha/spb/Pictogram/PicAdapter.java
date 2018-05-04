package ru.sasha.spb.Pictogram;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;// is responsible for cashing and threads

import java.util.List;

public class PicAdapter extends RecyclerView.Adapter<PicAdapter.PicHolder> {

    @NonNull
    private final List<Pic> pics;

    @NonNull
    private final OnItemClickListener onItemClickListener;

    @NonNull
    private final View.OnClickListener internalClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Pic pic = (Pic) view.getTag();
            if (pic != null) {
                int position = pics.indexOf(pic);
                onItemClickListener.onItemClick(pic, position);
            }
        }
    };

    public PicAdapter(@NonNull List<Pic> pics, @NonNull OnItemClickListener onItemClickListener) {
        this.pics = pics;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public PicHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new PicHolder(inflater.inflate(R.layout.item_pic, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final PicHolder holder, int position) {
        Pic pic = pics.get(position);
        holder.Image.setOnClickListener(internalClickListener);
        holder.Image.setTag(pic);
        Picasso.get().load(pic.getUrl()).into(holder.Image, new Callback() {

            //error handling
            @Override
            public void onSuccess() {

            }


            @Override
            public void onError(Exception e) {

                holder.Image.setImageResource(R.drawable.notloaded);

            }
        });
    }

    @Override
    public int getItemCount() {
        return pics.size();
    }

    interface OnItemClickListener {
        void onItemClick(@NonNull Pic pic, int position);
    }

    static class PicHolder extends RecyclerView.ViewHolder {

        @NonNull
        private final ImageView Image;

        PicHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.IMAGE);
        }
    }
}