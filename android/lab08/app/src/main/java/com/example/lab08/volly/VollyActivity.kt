package com.example.lab08.volly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.lab08.R
import com.example.lab08.databinding.ActivityVollyBinding
import org.json.JSONObject


class VollyActivity : AppCompatActivity() {
    lateinit var binding:ActivityVollyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val queue= Volley.newRequestQueue(this)

        super.onCreate(savedInstanceState)
        binding= ActivityVollyBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val request=JsonObjectRequest(
                Request.Method.GET,
            "https://reqres.in/api/users/2",
            null,
            Response.Listener<JSONObject> { response ->
                val dataJson = response.getJSONObject("data")
                val id=dataJson.getString("id")
                val email=dataJson.getString("email")
                binding.textView.text = "$id $email"
            },
            Response.ErrorListener {
                binding.textView.text="error"
            })
            queue.add(request)
        }
    }
}