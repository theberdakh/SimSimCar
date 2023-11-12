package com.theberdakh.simsimcar

import android.bluetooth.BluetoothClass
import android.bluetooth.BluetoothDevice

fun getDeviceType(deviceType: Int) = when(deviceType){
    BluetoothDevice.DEVICE_TYPE_LE -> "Low energy"
    BluetoothDevice.DEVICE_TYPE_CLASSIC -> "Classic BR/EDR"
    BluetoothDevice.DEVICE_TYPE_DUAL -> "Dual"
    else -> "Unknown"
}
