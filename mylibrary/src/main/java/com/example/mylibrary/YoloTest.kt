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

//        val file = File(context.filesDir, asset)
//
//        try {
//            val inpStream: InputStream = context.assets.open(asset)
//            val outStream = FileOutputStream(file, false)
//            val buffer = ByteArray(4 * 1024)
//            var read: Int
//
//            while (true) {
//                read = inpStream.read(buffer)
//                if (read == -1) {
//                    break
//                }
//                outStream.write(buffer, 0, read)
//            }
//            outStream.flush()
//            return file.absolutePath
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
        return "file:///android_asset/"+asset;
    }

//    fun getModel(context: Context): InputStream {
//        val am = context.assets
//        return am.open("best_yolov5s_small_torchscript.pt")
//    }

}