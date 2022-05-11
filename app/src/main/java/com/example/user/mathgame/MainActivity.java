package com.example.user.mathgame;





        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TaiJiButton taiJiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
//        setContentView(new GameStart(this));
    }

    private void init() {
        taiJiButton = (TaiJiButton) findViewById(R.id.taiJiButton);
        taiJiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!taiJiButton.isLoading()) {
                    taiJiButton.startLoad();
                }
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (taiJiButton != null && taiJiButton.isLoading()) {
                    taiJiButton.stopLoad();
                }
            }
        });
    }
}
