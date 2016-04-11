package andrey.jollydroid_3103_a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 11.04.2016.
 */
public class Item {
    int width, height,image;
    public Item(int image,Context context){
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), image);
        width=bitmap.getWidth();
        height=bitmap.getHeight();
        this.image=image;

    }

    }

