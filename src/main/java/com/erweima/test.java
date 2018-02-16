package com.erweima;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Danny on 2018/2/17.
 */
public class test {
    public static void main(String[] args) throws IOException, WriterException {
        //二维码中保存的信息
        String content = "张屁屁真可爱";
        //生成的二维码保存的路径
        String path = "G:\\erweima";
        MultiFormatWriter multiFormatWrite = new MultiFormatWriter();
        Map hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        // 按照指定的宽度，高度和附加参数对字符串进行编码
        //生成二维码
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        BitMatrix bitMatrix = multiFormatWrite.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
        File file1 = new File(path,sdf.format(new Date())+".jpg");
        // 写入文件
        MartixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
        System.out.println("二维码图片生成成功！");
    }

}
