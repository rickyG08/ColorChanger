package edu.cnm.deepdive.colorchanger;

import android.graphics.Color;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements OnSeekBarChangeListener {

  private SeekBar red, green, blue;
  private ConstraintLayout layout;
  private OnClickListener reset; // reset button not implemented.


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    layout = findViewById(R.id.screen);

    red = (SeekBar) findViewById(R.id.red_bar);
    green = (SeekBar) findViewById(R.id.green_bar);
    blue = (SeekBar) findViewById(R.id.blue_bar);

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