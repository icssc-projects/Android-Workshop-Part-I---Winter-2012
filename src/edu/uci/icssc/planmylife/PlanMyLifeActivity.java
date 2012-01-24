package edu.uci.icssc.planmylife;

import java.util.Calendar;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PlanMyLifeActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv = (TextView)findViewById(R.id.date);
        Calendar date = Calendar.getInstance();
        String dayOfWeek = date.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
        String month = date.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault());
        int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
        tv.setText(dayOfWeek + ", " + month + " " + dayOfMonth);
        Button activitylist = (Button)findViewById(R.id.activitybutton);
        activitylist.setOnClickListener(this);
        Button calendar = (Button)findViewById(R.id.calendarbutton);
        calendar.setOnClickListener(this);
    }

	@Override
	public void onClick(View view) 
	{
		switch(view.getId())
		{
		case R.id.activitybutton:
			Intent intent1 = new Intent(this, ActivityList.class);
			startActivity(intent1);
			break;
		case R.id.calendarbutton:
			Intent intent2 = new Intent(this, CalendarActivity.class);
			startActivity(intent2);
			break;
		}
	}
}