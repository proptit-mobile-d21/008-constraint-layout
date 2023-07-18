package dev.proptit.constraintlayoutdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.HorizontalScrollView

/**
 * @author StackOverflow + a little ChatGPT
 */
class FullWidthImageView(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
    androidx.appcompat.widget.AppCompatImageView(context, attrs, defStyleAttr) {

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val parentScrollView = parent.parent as View?

        var width = widthMeasureSpec
        var height = heightMeasureSpec
        var needsRemeasure = false

        if (parentScrollView != null) {
            // check the container of the container is an HorizontallScrollView
            if (parentScrollView is HorizontalScrollView) {
                // Yes it is, so change width to HSV's width
                val parentWidth = parentScrollView.measuredWidth
                if (parentWidth > 0) {
                    width = parentWidth
                } else {
                    needsRemeasure = true
                }
            }
        }
        if (drawable != null) {
            // Calculate the aspect ratio of the loaded image
            val imageWidth = drawable.intrinsicWidth
            val imageHeight = drawable.intrinsicHeight
            val aspectRatio = imageWidth.toFloat() / imageHeight

            // Calculate the new height based on the aspect ratio and width
            val newHeight = (width.toFloat() / aspectRatio).toInt()

            // Use the new height if it is greater than the measured height
            if (newHeight > MeasureSpec.getSize(heightMeasureSpec)) {
                height = MeasureSpec.makeMeasureSpec(newHeight, MeasureSpec.EXACTLY)
            }
        }

        super.onMeasure(width, height)

        setMeasuredDimension(
            MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
            MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
        )

        if (needsRemeasure) {
            post { requestLayout() }
        }
    }
}