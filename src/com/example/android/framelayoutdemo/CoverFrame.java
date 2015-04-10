package com.example.android.framelayoutdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.android.swipedismiss.R;

public class CoverFrame extends Activity {

    private boolean     isMask   = true;

    private FrameLayout layout   = null;
    private Button      btn      = null;
    private TextView    textView = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.framedemo);

        initViews();
    }

    private void initViews() {

        layout = (FrameLayout) findViewById(R.id.layout);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new MaskListener());

    }

    // 按钮监听，显示/隐藏遮罩
    private class MaskListener implements OnClickListener {

        @SuppressWarnings("deprecation")
        public void onClick(View v) {
            if (isMask) {
                if (textView == null) {
                    textView = new TextView(CoverFrame.this);//修改的位置
                    textView.setTextColor(Color.BLUE);
                    textView.setTextSize(20);
                    textView.setText("I am a mask.");
                    textView.setGravity(Gravity.CENTER);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                                                                        ViewGroup.LayoutParams.FILL_PARENT));
                    textView.setBackgroundColor(Color.parseColor("#33FFFFFF"));
                }
                btn.setText("show");
                isMask = false;
                layout.addView(textView);
            } else {
                btn.setText("hide");
                isMask = true;
                layout.removeView(textView);
            }
        }
    }
}
