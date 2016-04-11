package andrey.jollydroid_3103_a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 11.04.2016.
 */
public class MyView extends FrameLayout {

    private Item item;
    private ImageView imageView;
    int drawablewidth,drawableheight;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImages(int drawable, int width, int height) {
        drawablewidth=width;
        drawableheight=height;

        invalidate();
        Picasso.with(getContext()).load(drawable).fit().into(imageView);

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        imageView=(ImageView)findViewById(R.id.MyImage);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int widthSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        final int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);

        final int widthSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        final int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);

        int measuredWidth = 1;
        switch (widthSpecMode) {
            case MeasureSpec.UNSPECIFIED:

            measuredWidth = drawablewidth;
                break;

            case MeasureSpec.AT_MOST:

               measuredWidth = Math.min(drawablewidth, widthSpecSize);
                break;

            case MeasureSpec.EXACTLY:
                measuredWidth = widthSpecSize;
                break;
        }

        int measuredHeight = measuredWidth*drawableheight/drawablewidth;
        switch (heightSpecMode) {
            case MeasureSpec.UNSPECIFIED:

                break;

            case MeasureSpec.AT_MOST:
                measuredHeight = Math.min(measuredHeight, heightSpecSize);
                break;

            case MeasureSpec.EXACTLY:

                measuredHeight = heightSpecSize;
                break;
        }

        super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, MeasureSpec.EXACTLY),
                MeasureSpec.makeMeasureSpec(measuredHeight, MeasureSpec.EXACTLY));



    }
}
