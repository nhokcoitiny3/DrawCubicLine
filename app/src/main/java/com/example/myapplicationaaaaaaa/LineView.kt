package com.example.myapplicationaaaaaaa

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View


class LineView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val mPoint1 = PointF(width / 1.2f, height / 1.2f)
        val mPoint2 = PointF((width / 24).toFloat(), height / 1.2f)
        var myPath1: Path?
        val paint = Paint()
        paint.setAntiAlias(true)
        paint.setStyle(Paint.Style.STROKE)
        paint.setStrokeWidth(2F)
        paint.setColor(Color.WHITE)
        myPath1 = drawCurve(canvas, paint, mPoint1, mPoint2)
        canvas.drawPath(myPath1, paint)
    }

    private fun drawCurve(canvas: Canvas, paint: Paint, mPointa: PointF, mPointb: PointF): Path {
        val myPath = Path()
        myPath.moveTo((63 * width / 64).toFloat(), (height / 10).toFloat())
        myPath.quadTo(mPointa.x, mPointa.y, mPointb.x, mPointb.y)
        return myPath
    }
}