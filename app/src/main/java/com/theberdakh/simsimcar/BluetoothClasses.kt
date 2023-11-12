package com.theberdakh.simsimcar

import android.bluetooth.BluetoothClass

class BluetoothClasses {

    fun getClassName(code: Int) = when (code) {
        COMPUTER_UNCATEGORIZED -> "Computer Uncategorized"
        COMPUTER_DESKTOP -> "Computer Desktop"
        COMPUTER_SERVER -> "Computer Server"
        COMPUTER_LAPTOP -> "Computer Laptop"
        COMPUTER_HANDHELD_PC_PDA -> "Computer Handheld PC PDA"
        COMPUTER_PALM_SIZE_PC_PDA -> "Computer Palm Size PC PDA"
        COMPUTER_WEARABLE -> "Computer Wearable"

        PHONE_UNCATEGORIZED -> "Phone Uncategorized"
        PHONE_CELLULAR -> "Phone Cellular"
        PHONE_CORDLESS -> "Phone Cordless"
        PHONE_SMART -> "Phone Smart"
        PHONE_MODEM_OR_GATEWAY -> "Phone Modem or Gateway"
        PHONE_ISDN -> "Phone ISDN"

        AUDIO_VIDEO_UNCATEGORIZED -> "Audio Video Uncategorized"
        AUDIO_VIDEO_WEARABLE_HEADSET -> "Audio Video Wearable Headset"
        AUDIO_VIDEO_HANDSFREE -> "Audio Video Handsfre"

        AUDIO_VIDEO_MICROPHONE -> "Audio Video Microphone"
        AUDIO_VIDEO_LOUDSPEAKER -> "Audio Video Loudspeaker"
        AUDIO_VIDEO_HEADPHONES -> "Audio Video Headphones"
        AUDIO_VIDEO_PORTABLE_AUDIO -> "Audio Video Portable Audio"
        AUDIO_VIDEO_CAR_AUDIO -> "Audio Video Car Audio"
        AUDIO_VIDEO_SET_TOP_BOX -> "Audio Video Set Top Box"
        AUDIO_VIDEO_HIFI_AUDIO -> "Audio Video HIFI Audio"
        AUDIO_VIDEO_VCR -> "Audio Video VCR"
        AUDIO_VIDEO_VIDEO_CAMERA -> "Audio Video Camera"
        AUDIO_VIDEO_CAMCORDER -> "Audio Video Camcorder"
        AUDIO_VIDEO_VIDEO_MONITOR -> "Audio Video Monitor"
        AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER -> "Audio Video Display and Loudspeaker"
        AUDIO_VIDEO_VIDEO_CONFERENCING -> "Audio Video Conferencing"
        AUDIO_VIDEO_VIDEO_GAMING_TOY -> "Audio Video Gaming Toy"

        WEARABLE_UNCATEGORIZED -> "Wearable Uncategorized"
        WEARABLE_WRIST_WATCH -> "Wearable Wrist Watch"
        WEARABLE_PAGER -> "Wearable Pager"
        WEARABLE_JACKET -> "Wearable Jacket"
        WEARABLE_HELMET -> "Wearable Helmet"
        WEARABLE_GLASSES -> "Wearable Glasses"

        TOY_UNCATEGORIZED -> "Toy Uncategorized"
        TOY_ROBOT -> "Toy Robot"
        TOY_VEHICLE -> "Toy Vehicle"
        TOY_DOLL_ACTION_FIGURE -> "Toy Doll Action Figure"
        TOY_CONTROLLER -> "Toy Controller"
        TOY_GAME -> "Toy Game"

        HEALTH_UNCATEGORIZED -> "Health Uncategorized"
        HEALTH_BLOOD_PRESSURE -> "Health Blood Pressure"
        HEALTH_THERMOMETER -> "Health Thermometer"
        HEALTH_WEIGHING -> "Health Weighing"
        HEALTH_GLUCOSE -> "Health Glucose"
        HEALTH_PULSE_OXIMETER -> "Health Pulse Oximeter"
        HEALTH_PULSE_RATE -> "Health Pulse Rate"
        HEALTH_DATA_DISPLAY -> "Health Data Display"

        PERIPHERAL_NON_KEYBOARD_NON_POINTING -> "Peripheral Non Keyboard Non Pointing"
        PERIPHERAL_KEYBOARD -> "Peripheral Keyboard"
        PERIPHERAL_POINTING -> "Peripheral Pointing"
        PERIPHERAL_KEYBOARD_POINTING -> "Peripheral Keyboard Pointing"
        MISC -> "MISC"
        COMPUTER -> "COMPUTER"
        PHONE -> "PHONE"
        NETWORKING -> "NETWORKING"
        AUDIO_VIDEO -> "AUDIO VIDEO"
        PERIPHERAL -> "PERIPHERAL"
        IMAGING -> "IMAGING"
        WEARABLE -> "WEARABLE"
        TOY -> "TOY"
        HEALTH -> "HEALTH"
        UNCATEGORIZED -> "UNCATEGORIZED"
        else -> "Others"
    }


    private val BITMASK = 0x1F00

    val MISC = 0x0000
    val COMPUTER = 0x0100
    val PHONE = 0x0200
    val NETWORKING = 0x0300
    val AUDIO_VIDEO = 0x0400
    val PERIPHERAL = 0x0500
    val IMAGING = 0x0600
    val WEARABLE = 0x0700
    val TOY = 0x0800
    val HEALTH = 0x0900
    val UNCATEGORIZED = 0x1F00

    companion object {


        // Devices in PERIPHERAL major class
        const val PERIPHERAL_NON_KEYBOARD_NON_POINTING = 0x0500
        const val PERIPHERAL_KEYBOARD = 0x0540
        const val PERIPHERAL_POINTING = 0x0580
        const val PERIPHERAL_KEYBOARD_POINTING = 0x05C0

        // Devices in the HEALTH major class
        const val HEALTH_UNCATEGORIZED = 0x0900
        const val HEALTH_BLOOD_PRESSURE = 0x0904
        const val HEALTH_THERMOMETER = 0x0908
        const val HEALTH_WEIGHING = 0x090C
        const val HEALTH_GLUCOSE = 0x0910
        const val HEALTH_PULSE_OXIMETER = 0x0914
        const val HEALTH_PULSE_RATE = 0x0918
        const val HEALTH_DATA_DISPLAY = 0x091C

        // Devices in the TOY major class
        const val TOY_UNCATEGORIZED = 0x0800
        const val TOY_ROBOT = 0x0804
        const val TOY_VEHICLE = 0x0808
        const val TOY_DOLL_ACTION_FIGURE = 0x080C
        const val TOY_CONTROLLER = 0x0810
        const val TOY_GAME = 0x0814

        // Devices in the WEARABLE major class
        const val WEARABLE_UNCATEGORIZED = 0x0700
        const val WEARABLE_WRIST_WATCH = 0x0704
        const val WEARABLE_PAGER = 0x0708
        const val WEARABLE_JACKET = 0x070C
        const val WEARABLE_HELMET = 0x0710
        const val WEARABLE_GLASSES = 0x0714

        // Devices in the COMPUTER major class
        const val COMPUTER_UNCATEGORIZED = 0x0100
        const val COMPUTER_DESKTOP = 0x0104
        const val COMPUTER_SERVER = 0x0108
        const val COMPUTER_LAPTOP = 0x010C
        const val COMPUTER_HANDHELD_PC_PDA = 0x0110
        const val COMPUTER_PALM_SIZE_PC_PDA = 0x0114
        const val COMPUTER_WEARABLE = 0x0118

        // Devices in the PHONE major class
        const val PHONE_UNCATEGORIZED = 0x0200
        const val PHONE_CELLULAR = 0x0204
        const val PHONE_CORDLESS = 0x0208
        const val PHONE_SMART = 0x020C
        const val PHONE_MODEM_OR_GATEWAY = 0x0210
        const val PHONE_ISDN = 0x0214

        // Minor classes for the AUDIO_VIDEO major class
        const val AUDIO_VIDEO_UNCATEGORIZED = 0x0400
        const val AUDIO_VIDEO_WEARABLE_HEADSET = 0x0404
        const val AUDIO_VIDEO_HANDSFREE = 0x0408

        //public static final int AUDIO_VIDEO_RESERVED              = 0x040C;
        const val AUDIO_VIDEO_MICROPHONE = 0x0410
        const val AUDIO_VIDEO_LOUDSPEAKER = 0x0414
        const val AUDIO_VIDEO_HEADPHONES = 0x0418
        const val AUDIO_VIDEO_PORTABLE_AUDIO = 0x041C
        const val AUDIO_VIDEO_CAR_AUDIO = 0x0420
        const val AUDIO_VIDEO_SET_TOP_BOX = 0x0424
        const val AUDIO_VIDEO_HIFI_AUDIO = 0x0428
        const val AUDIO_VIDEO_VCR = 0x042C
        const val AUDIO_VIDEO_VIDEO_CAMERA = 0x0430
        const val AUDIO_VIDEO_CAMCORDER = 0x0434
        const val AUDIO_VIDEO_VIDEO_MONITOR = 0x0438
        const val AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER = 0x043C
        const val AUDIO_VIDEO_VIDEO_CONFERENCING = 0x0440

        //public static final int AUDIO_VIDEO_RESERVED              = 0x0444;
        const val AUDIO_VIDEO_VIDEO_GAMING_TOY = 0x0448


    }


}