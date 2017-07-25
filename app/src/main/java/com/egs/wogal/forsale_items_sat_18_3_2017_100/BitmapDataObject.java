package com.egs.wogal.forsale_items_sat_18_3_2017_100;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by wogal on 4/1/2017.
 */

// earle

public class BitmapDataObject {

    private Bitmap currentImage;

    //  public com.egs.wogal.forsale_items_sat_18_3_2017_100.BitmapDataObject(Bitmap bitmap)
    //  {
    //     currentImage = bitmap;
    // }
    // wogal


    // takes bitmap and converts to byte array for disk write
    public static byte[] writeObject (Bitmap _bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        _bitmap.compress( Bitmap.CompressFormat.PNG, 100, stream );
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    public static Bitmap readObject (byte[] _bitMapArray) {

        if (false) {
            int bufferLength = _bitMapArray.length;
            ByteArrayInputStream in = new ByteArrayInputStream( _bitMapArray );
            byte[] byteArray = new byte[bufferLength];
            int pos = 0;
            do {
                int read = in.read( byteArray, pos, bufferLength - pos );

                if (read != -1) {
                    pos += read;
                } else {
                    break;
                }

            } while (pos < bufferLength);
        }
        Bitmap mBitmapB;
        //    mBitmapB = BitmapFactory.decodeByteArray( byteArray, 0, bufferLength );
        mBitmapB = BitmapFactory.decodeByteArray( _bitMapArray, 0, _bitMapArray.length );
        return mBitmapB;
    }
}

