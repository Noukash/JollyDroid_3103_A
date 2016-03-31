package andrey.jollydroid_3103_a;

import android.app.Application;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Andrey on 31.03.2016.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    static final int images[] = {R.drawable.ras1,R.drawable.ras2,R.drawable.ras3};
    Context context;
    public Adapter(Context context) {
        this.context = context;
    }


    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item,
                parent,
                false
        );



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.image.setImageDrawable(ContextCompat.getDrawable(context, images[position]));

    }



    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.MyImage);

        }
    }

}

