package edu.cnm.deepdive.colorchanger;

import android.graphics.Color;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements OnSeekBarChangeListener {

  SeekBar red, green, blue;
  ConstraintLayout layout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    layout = findViewById(R.id.screen);

    red = findViewById(R.id.red);
    green = findViewById(R.id.green);
    blue = findViewById(R.id.blue);

    red.setOnSeekBarChangeListener(this);
    green.setOnSeekBarChangeListener(this);
    blue.setOnSeekBarChangeListener(this);
  }

  @Override
  public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    layout.setBackgroundColor(
        Color.rgb(red.getProgress(), green.getProgress(), blue.getProgress()));
  }

  @Override
  public void onStartTrackingTouch(SeekBar seekBar) {

  }

  @Override
  public void onStopTrackingTouch(SeekBar seekBar) {

  }
}