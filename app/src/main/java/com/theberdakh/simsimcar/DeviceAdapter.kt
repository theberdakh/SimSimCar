package com.theberdakh.simsimcar

import android.bluetooth.BluetoothClass
import android.bluetooth.BluetoothDevice
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.theberdakh.simsimcar.databinding.ItemListDeviceBinding


class DeviceAdapter(): ListAdapter<BluetoothDevice,DeviceAdapter.DeviceViewHolder >(deviceCallback) {


    private lateinit var onOrderClick: (BluetoothDevice) -> Unit
    fun onOrderClickListener(onOrderClick:(BluetoothDevice) -> Unit ){
        this.onOrderClick = onOrderClick
    }

    inner class DeviceViewHolder(private val binding: ItemListDeviceBinding): ViewHolder(binding.root){
        fun bind(){
            val device = getItem(adapterPosition)

            val type = when(device.type){
                BluetoothDevice.DEVICE_TYPE_LE -> "Low energy"
                BluetoothDevice.DEVICE_TYPE_CLASSIC -> "Classic BR/EDR"
                BluetoothDevice.DEVICE_TYPE_DUAL -> "Dual"
                else -> "Unknown"
            }

            binding.name.text = "${device.name} ($type)"
            val className = BluetoothClasses().getClassName(device.bluetoothClass.deviceClass)
            binding.address.text = "$className | ${device.address}"
            binding.root.setOnClickListener {
                onOrderClick.invoke(device)
            }

        }
    }

    private object deviceCallback: DiffUtil.ItemCallback<BluetoothDevice>(){
        override fun areItemsTheSame(oldItem: BluetoothDevice, newItem: BluetoothDevice): Boolean {
            return oldItem.address == newItem.address
        }

        override fun areContentsTheSame(
            oldItem: BluetoothDevice,
            newItem: BluetoothDevice
        ): Boolean {
            return oldItem.address == newItem.address
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceViewHolder {
        return DeviceViewHolder(ItemListDeviceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: DeviceViewHolder, position: Int) = holder.bind()
}