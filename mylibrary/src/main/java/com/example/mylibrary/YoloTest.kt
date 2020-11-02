package com.example.mylibrary

import android.content.Context
import android.content.res.AssetFileDescriptor
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream


object YoloTest {

    init {}

    fun getModelPath(context: Context): String {
        val asset: String="best_yolov5s_small_torchscript.pt"
        return "file:///android_asset/"+asset;
    }

}