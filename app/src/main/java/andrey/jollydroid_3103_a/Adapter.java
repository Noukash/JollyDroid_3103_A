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

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 31.03.2016.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    static final int images[] = {R.drawable.ras1, R.drawable.ras2, R.drawable.ras3, R.drawable.ras4, R.drawable.ras5, R.drawable.ras6, R.drawable.ras6, R.drawable.ras8, R.drawable.ras9,};

    Context context;
    Item item;
    List<Item> ListItem;

    public Adapter(Context context) {
        this.context = context;
        if(ListItem==null) {
            ListItem = new ArrayList<>();
            for (int image:images) {
                ListItem.add(new Item(image, context));

            }
        }

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
        item=ListItem.get(position);
       holder.MyView.setImages(item.image, item.width, item.height);

    }



    @Override
    public int getItemCount() {
        return ListItem.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public MyView MyView;

        public ViewHolder(View itemView) {
            super(itemView);
            MyView=(MyView)itemView.findViewById(R.id.MyView);

        }
    }

}

