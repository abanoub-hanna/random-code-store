package com.abanoubhanna.imagecompressor

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.abanoubhanna.imagecompressor.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.img1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.test))

        //CoroutineScope(Dispatchers.Default).launch { runOnBackground() }
    }

    private suspend fun runOnBackground(){
        binding.img1.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.test))
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.test)
        val bits = getBytesFromBitmap(bitmap, 100)
        val str: String = bits?.let { getSize(it) }.toString()
        setSize1OnMainThread(str)

        binding.img2.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.test))
        val bitmap2 = BitmapFactory.decodeResource(resources, R.drawable.test)
        val bits2 = getBytesFromBitmap(bitmap2, 90)
        val str2: String = bits2?.let { getSize(it) }.toString()
        setSize2OnMainThread(str2)
    }

    private fun getBytesFromBitmap(bitmap: Bitmap, quality: Int): ByteArray? {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream)
        return outputStream.toByteArray()
    }

    private fun getSize(bits: ByteArray): String {
        val size = (bits.size / 1024)
        val sizeString = "$size KB"
        return sizeString
    }

    private suspend fun setSize1OnMainThread(str: String){
        withContext(Dispatchers.Main){
            binding.size1.text = str
        }
    }

    private suspend fun setSize2OnMainThread(str: String){
        withContext(Dispatchers.Main){
            binding.size2.text = str
        }
    }
}
