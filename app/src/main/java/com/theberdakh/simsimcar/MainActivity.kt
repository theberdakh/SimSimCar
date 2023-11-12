package com.theberdakh.simsimcar

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar
import com.theberdakh.simsimcar.databinding.ActivityMainBinding
import java.util.UUID


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = DeviceAdapter()
        binding.recyclerView?.adapter = adapter



        binding.connect?.setOnClickListener {

            binding.recyclerView?.isVisible = true

            val pairedDevices = BluetoothAdapter.getDefaultAdapter().bondedDevices

            if (pairedDevices.size > 0) {
                adapter.submitList(pairedDevices.toList())
            } else {
                showToast(
                    getString(R.string.no_paired_device),
                )
            }

        }
        binding.logoName?.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tg://resolve?domain=simsimschool"))

            it.showSnackbar(
                it,
                "Oqıw oray tuwralı biliw ushın Telegram kanalımızǵa aǵza bolıń:",
                Snackbar.LENGTH_LONG,
                "Telegramdı ashıw",
            ){
                startActivity(browserIntent)
            }
        }


        adapter.onOrderClickListener {

            val uniqueId = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")
            val socket = it.createRfcommSocketToServiceRecord(uniqueId)
            if (socket.isConnected){
                socket.close()
            } else {
                socket.connect()
            }

            binding.connect?.subtitle = getString(R.string.device_is_connected, it.name)
            binding.recyclerView?.isVisible = false


            binding.up?.onTouchSendListener("G", socket.outputStream)
            binding.left?.onTouchSendListener("L", socket.outputStream)
            binding.right?.onTouchSendListener("R", socket.outputStream)
            binding.down?.onTouchSendListener("B", socket.outputStream)



        }









    }






}