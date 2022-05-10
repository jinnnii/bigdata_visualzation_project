package com.example.lab05

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioAttributes
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import com.example.lab05.databinding.ActivitySoundBinding

class SoundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivitySoundBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val uri=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val ringtone = RingtoneManager.getRingtone(applicationContext,uri)
            ringtone.play()
        }

        binding.button.setOnClickListener {
            val vibrator = if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.S){
                //최신 버전
                val manager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                manager.defaultVibrator
            }else{
                //예전 버전
                getSystemService(VIBRATOR_SERVICE) as Vibrator
            }
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
                    vibrator.vibrate(VibrationEffect.createOneShot(500,VibrationEffect.DEFAULT_AMPLITUDE))
                }else{
                    vibrator.vibrate(500)
                }
        }

        binding.button.setOnClickListener {
            val manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val builder:NotificationCompat.Builder

            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
                val chanel = NotificationChannel("one","on chanel", NotificationManager.IMPORTANCE_LOW)
                chanel.description="on description"


                val uri=RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
                val audioAttributes = AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .setUsage(AudioAttributes.USAGE_ALARM)
                    .build()

                chanel.setSound(uri, audioAttributes)
                chanel.enableLights(true)
                chanel.lightColor= Color.RED
                chanel.enableVibration(true)
                chanel.vibrationPattern= longArrayOf(100,200,100,200)

                manager.createNotificationChannel(chanel)
                builder = NotificationCompat.Builder(this, "one")
            }else{
                builder=NotificationCompat.Builder(this)
            }
            builder.setSmallIcon(android.R.drawable.ic_notification_overlay)
            builder.setWhen(System.currentTimeMillis())
            builder.setContentTitle("Title")
            builder.setContentText("Content")

            manager.notify(11, builder.build())

            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent=
                PendingIntent.getActivity(this, 10, intent,
                    PendingIntent.FLAG_IMMUTABLE)

            builder.setContentIntent(pendingIntent) //터치 이벤트 등록록

            val actionPendingIntent = PendingIntent.getBroadcast(this, 20, intent,
            PendingIntent.FLAG_IMMUTABLE)

            builder.addAction(
                NotificationCompat.Action.Builder(
                    android.R.drawable.stat_notify_more,
                    "Action",
                    actionPendingIntent
                ).build()
            )

            val KEY_TEXT_REPLY="key_text_reply"
            var replyLabel:String="답장"
            var remoteInput:RemoteInput=RemoteInput.Builder(KEY_TEXT_REPLY).run{
                setLabel(replyLabel)
                build()
            }

            val replyIntent = Intent(this, MainActivity::class.java)
            val replyPendingIntent = PendingIntent.getBroadcast(this, 30, replyIntent,
                PendingIntent.FLAG_MUTABLE)
            builder.addAction(
                NotificationCompat.Action.Builder(
                    R.drawable.ic_launcher_background,
                    "답장",
                    replyPendingIntent
                ).addRemoteInput(remoteInput).build()
            )
        }


   }
}


